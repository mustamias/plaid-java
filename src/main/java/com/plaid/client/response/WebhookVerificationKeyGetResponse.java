package com.plaid.client.response;

public final class WebhookVerificationKeyGetResponse extends BaseResponse {
  private WebhookVerificationKey key;

  public WebhookVerificationKey getKey() {
    return key;
  }

  public static final class WebhookVerificationKey {
    private String alg;
    private Integer createdAt;
    private String crv;
    private Integer expiredAt;
    private String kid;
    private String kty;
    private String use;
    private String x;
    private String y;

    public String getAlg() {
      return alg;
    }

    public Integer getCreatedAt() {
      return createdAt;
    }

    public String getCrv() {
      return crv;
    }

    public Integer getExpiredAt() {
      return expiredAt;
    }

    public String getKid() {
      return kid;
    }

    public String getKty() {
      return kty;
    }

    public String getUse() {
      return use;
    }

    public String getX() {
      return x;
    }

    public String getY() {
      return y;
    }
  }
}