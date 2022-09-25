package com.google.android.libraries.search.assistant.performer.p2767j;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.presencemanager.C145759c;
import com.google.android.gms.presencemanager.PresentUser;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p3339v.C43205e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3921j.C51671ads;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.assistant.p3897e.p3921j.adr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62974ct;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p3186j$.time.Duration;
import p3186j$.util.Objects;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.performer.j.o */
/* compiled from: PG */
public final class C36193o {

    /* renamed from: a */
    public static final C59071e f94556a = C59071e.m91332i("com.google.android.libraries.search.assistant.performer.j.o");

    /* renamed from: b */
    private static final Duration f94557b = Duration.ofSeconds(2);

    /* renamed from: c */
    private final C145759c f94558c;

    /* renamed from: d */
    private final C21370a f94559d;

    /* renamed from: e */
    private final ScheduledExecutorService f94560e;

    public C36193o(C21370a aVar, ScheduledExecutorService scheduledExecutorService, C145759c cVar) {
        this.f94559d = aVar;
        this.f94560e = scheduledExecutorService;
        this.f94558c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo40005a(Object obj, C51809dy dyVar, Function function) {
        String str;
        try {
            Optional c = C36183e.m64585c(dyVar, "presence_manager_args", C51671ads.f134906c.getParserForType());
            if (c.isEmpty() || (((C51671ads) c.get()).f134908a & 1) == 0) {
                ((C59052c) ((C59052c) f94556a.mo56224b()).mo56372aa(52201)).mo56386p("No PresenceManagerArgs. Skipping PrM connection.");
                return C60856cj.m92900i(obj);
            }
            C51671ads ads = (C51671ads) c.get();
            adr adr = ads.f134909b;
            if (adr == null) {
                adr = adr.f134901c;
            }
            if (adr.f134904b) {
                str = null;
            } else {
                adr adr2 = ads.f134909b;
                if (adr2 == null) {
                    adr2 = adr.f134901c;
                }
                str = adr2.f134903a;
            }
            String str2 = str;
            C145759c cVar = this.f94558c;
            long b = this.f94559d.mo26870b();
            C143919bh.m233969l("TTL_EXPIRATION");
            C47633f j = C47633f.m84733g(C43205e.m76192b(cVar.mo121919a(new PresentUser(str2, b, 1, 1, "TTL_EXPIRATION", "SOURCE_VOICE_MATCH")))).mo51517j(f94557b.toMillis(), TimeUnit.MILLISECONDS, this.f94560e);
            Objects.requireNonNull(function);
            return j.mo51515h(new C36191m(function), this.f94560e).mo51513e(Throwable.class, new C36192n(obj), C60826bg.f164896a);
        } catch (C62974ct unused) {
            ((C59052c) ((C59052c) f94556a.mo56226d()).mo56372aa(52202)).mo56386p("Unable to parse proto.");
            return C60856cj.m92900i(obj);
        }
    }

    /* renamed from: b */
    public final C60870cx mo40006b(Bundle bundle, C51809dy dyVar) {
        ((C59052c) ((C59052c) f94556a.mo56224b()).mo56372aa(52203)).mo56386p("Attempting to add user identity to bundle.");
        return mo40005a(bundle, dyVar, new C36189k(bundle));
    }
}
