package com.google.android.gms.usonia.metrics.internal;

/* renamed from: com.google.android.gms.usonia.metrics.internal.a */
/* compiled from: PG */
public enum C146293a {
    SERVICE_CLIENT_CHANNEL_CREATE_DELAY("Usonia.Service.Client.ChannelCreateDelay", false),
    SERVICE_CLIENT_STATUS_CODE("Usonia.Service.Client.StatusCode", true),
    SERVICE_CLIENT_REQUEST_COUNT("Usonia.Service.Client.RequestCount", true),
    SERVICE_CLIENT_RESPONSE_COUNT("Usonia.Service.Client.ResponseCount", true),
    TRAIT_SUBSCRIBE_CLIENT_FIRST_STATUS_CODE("Usonia.Trait.Subscribe.Client.FirstStatusCode", true),
    TRAIT_SUBSCRIBE_CLIENT_STATUS_CODE("Usonia.Trait.Subscribe.Client.StatusCode", true),
    TRAIT_SUBSCRIBE_CLIENT_REQUEST_COUNT("Usonia.Trait.Subscribe.Client.RequestSent.Count", true),
    TRAIT_SUBSCRIBE_CLIENT_RESPONSE_COUNT("Usonia.Trait.Subscribe.Client.ResponseReceived.Count", true),
    TRAIT_SUBSCRIBE_CLIENT_RTT("Usonia.Trait.Subscribe.Client.RoundTripLatency", true),
    TRAIT_SUBSCRIBE_CLIENT_FIRST_SUBSCRIPTION_DELAY("Usonia.Trait.Subscribe.Client.FirstUberSubscriptionDelay", true),
    TRAIT_VIEW_CLIENT_STATUS_CODE("Usonia.Trait.View.Client.StatusCode", true),
    TRAIT_VIEW_CLIENT_REQUEST_COUNT("Usonia.Trait.View.Client.RequestSent.Count", true),
    TRAIT_VIEW_CLIENT_RESPONSE_COUNT("Usonia.Trait.View.Client.ResponseReceived.Count", true),
    TRAIT_VIEW_CLIENT_RTT("Usonia.Trait.View.Client.RoundTripLatency", true);
    

    /* renamed from: o */
    public final String f395147o;

    /* renamed from: p */
    public final Boolean f395148p;

    private C146293a(String str, boolean z) {
        this.f395147o = str;
        this.f395148p = Boolean.valueOf(z);
    }
}
