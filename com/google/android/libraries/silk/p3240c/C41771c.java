package com.google.android.libraries.silk.p3240c;

import com.google.android.libraries.search.silk.p3184c.C40656a;
import com.google.common.p4552o.C59591api;
import com.google.common.p4552o.apk;
import com.google.common.p4552o.apn;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57695ab;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.silk.c.c */
/* compiled from: PG */
public final /* synthetic */ class C41771c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C41871q f109129a;

    /* renamed from: b */
    public final /* synthetic */ C59591api f109130b;

    /* renamed from: c */
    public final /* synthetic */ String f109131c;

    /* renamed from: d */
    public final /* synthetic */ String f109132d;

    public /* synthetic */ C41771c(C41871q qVar, C59591api api, String str, String str2) {
        this.f109129a = qVar;
        this.f109130b = api;
        this.f109131c = str;
        this.f109132d = str2;
    }

    public final void accept(Object obj) {
        apk apk;
        C41871q qVar = this.f109129a;
        C59591api api = this.f109130b;
        String str = this.f109131c;
        String str2 = this.f109132d;
        C40656a aVar = (C40656a) obj;
        api.copyOnWrite();
        apn apn = (apn) api.instance;
        apn apn2 = apn.f159680i;
        apn.f159682a |= 128;
        apn.f159686e = str;
        api.copyOnWrite();
        apn apn3 = (apn) api.instance;
        apn3.f159682a |= 256;
        apn3.f159687f = str2;
        api.copyOnWrite();
        apn apn4 = (apn) api.instance;
        apn4.f159683b = 2;
        apn4.f159682a |= 4;
        C57695ab abVar = qVar.f109267e;
        C57695ab abVar2 = C57695ab.CLIENT_ID_UNSPECIFIED;
        int ordinal = abVar.ordinal();
        if (ordinal == 1) {
            apk = apk.TNG_DISCOVER;
        } else if (ordinal == 3) {
            apk = apk.AGA_CLASSIC;
        } else if (ordinal == 5) {
            apk = apk.AOPA;
        } else if (ordinal == 7 || ordinal == 10) {
            apk = apk.GOOGLE_GO;
        } else if (ordinal != 12) {
            if (ordinal != 25) {
                if (ordinal != 27) {
                    if (ordinal != 29) {
                        switch (ordinal) {
                            case 14:
                                apk = apk.LENS_ANDROID;
                                break;
                            case 15:
                                apk = apk.PLAYGROUND_ANDROID;
                                break;
                            case 16:
                                apk = apk.TNG_WEATHER;
                                break;
                            case 17:
                                break;
                            case 18:
                                apk = apk.CARD_VIEWER;
                                break;
                            default:
                                switch (ordinal) {
                                    case 36:
                                        apk = apk.TNG_SUGGEST;
                                        break;
                                    case 37:
                                        break;
                                    case 38:
                                        apk = apk.IOS_SUGGEST;
                                        break;
                                    default:
                                        apk = apk.UNKNOWN_SURFACE;
                                        break;
                                }
                        }
                    }
                    apk = apk.TNG_ASSISTANT;
                } else {
                    apk = apk.IGA;
                }
            }
            apk = apk.XBLEND_ANDROID;
        } else {
            apk = apk.TNG_SEARCH;
        }
        api.copyOnWrite();
        apn apn5 = (apn) api.instance;
        apn5.f159684c = apk.f159677E;
        apn5.f159682a |= 16;
        aVar.mo42584a((apn) api.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
