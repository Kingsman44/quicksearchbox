package com.google.android.apps.search.weather;

import com.google.apps.tiktok.tracing.C47538ax;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.p5269w.p5270a.C67962d;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import p5488io.p5490b.p5496d.C69821c;

/* renamed from: com.google.android.apps.search.weather.s */
/* compiled from: PG */
public final /* synthetic */ class C142122s implements C69821c {

    /* renamed from: a */
    public final /* synthetic */ C142155u f385571a;

    public /* synthetic */ C142122s(C142155u uVar) {
        this.f385571a = uVar;
    }

    /* renamed from: a */
    public final void mo25818a(Object obj) {
        C67962d dVar;
        C142155u uVar = this.f385571a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C47538ax c = uVar.f385637g.mo51613c("WeatherFragmentPeer#updateLocation");
            try {
                dVar = C67962d.f184173g;
                C62921ba a = C62921ba.m95368a();
                dVar = (C67962d) C62942bv.parseFrom((C62942bv) C67962d.f184173g, (byte[]) axVar.mo56107c(), a);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) C142155u.f385631a.mo56225c()).mo56382g(e)).mo56372aa(42029)).mo56386p("Failed to parse Location from Bytes. Requesting WeatherApp with a current location.");
            } catch (Throwable th) {
                if (c != null) {
                    try {
                        c.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th2});
                        } catch (Exception unused) {
                        }
                    }
                }
                throw th;
            }
            uVar.f385646p = dVar;
            uVar.mo117037h(0);
            C142155u.m230775c(uVar.mo117035b());
            uVar.f385638h.mo26141d("weather_location_request_update_key");
            if (c != null) {
                c.close();
            }
        }
    }
}
