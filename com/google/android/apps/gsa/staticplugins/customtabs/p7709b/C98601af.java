package com.google.android.apps.gsa.staticplugins.customtabs.p7709b;

import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54098av;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54103b;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54120s;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.customtabs.b.af */
/* compiled from: PG */
public final /* synthetic */ class C98601af implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C98610ao f275386a;

    /* renamed from: b */
    public final /* synthetic */ long f275387b;

    public /* synthetic */ C98601af(C98610ao aoVar, long j) {
        this.f275386a = aoVar;
        this.f275387b = j;
    }

    public final C60870cx apply(Object obj) {
        C98610ao aoVar = this.f275386a;
        long j = this.f275387b;
        C54120s sVar = (C54120s) obj;
        C22871g gVar = aoVar.f275406e;
        long j2 = 0;
        if (!aoVar.mo91221d()) {
            C54098av avVar = sVar.f142012c;
            if (avVar == null) {
                avVar = C54098av.f141935j;
            }
            C54103b bVar = avVar.f141940d;
            if (bVar == null) {
                bVar = C54103b.f141956g;
            }
            long millis = (long) (((float) TimeUnit.SECONDS.toMillis(1)) * bVar.f141961d);
            j2 = millis > 0 ? Math.max(0, millis - (aoVar.f275411j.mo26870b() - j)) : millis;
        }
        return gVar.mo28204d("Delay, then return fetched documents", j2, new C98599ad(sVar));
    }
}
