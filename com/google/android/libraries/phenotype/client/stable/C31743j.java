package com.google.android.libraries.phenotype.client.stable;

import android.content.Context;
import android.content.IntentFilter;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.util.C144013m;
import com.google.android.libraries.phenotype.client.C31760t;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import java.util.Set;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.phenotype.client.stable.j */
/* compiled from: PG */
public final class C31743j implements C31754u {

    /* renamed from: a */
    public static volatile C58833ax f85330a;

    /* renamed from: b */
    public final boolean f85331b;

    /* renamed from: c */
    public final boolean f85332c;

    /* renamed from: d */
    public final C31727bs f85333d;

    /* renamed from: e */
    public final C31727bs f85334e;

    /* renamed from: f */
    private final Set f85335f;

    public C31743j(boolean z, boolean z2, Set set, C31727bs bsVar, C31727bs bsVar2) {
        this.f85331b = z;
        this.f85332c = z2;
        this.f85335f = set;
        this.f85333d = bsVar;
        this.f85334e = bsVar2;
    }

    /* renamed from: a */
    public final C31682aa mo37353a(C31760t tVar, String str) {
        Set set = this.f85335f;
        C31759z zVar = C31682aa.f85193a;
        C31758y yVar = new C31758y(tVar, str, this.f85332c, set);
        C58835az azVar = new C58835az(str, BuildConfig.FLAVOR);
        C31682aa aaVar = (C31682aa) zVar.f85358a.get(azVar);
        if (aaVar == null) {
            aaVar = (C31682aa) yVar.mo6453a();
            C31682aa aaVar2 = (C31682aa) ((ConcurrentHashMap) zVar.f85358a.f85157a).putIfAbsent(azVar, aaVar);
            if (aaVar2 == null) {
                Context context = tVar.f85364a;
                ((ConcurrentHashMap) C31714bf.f85271c.f85157a).putIfAbsent(azVar, new C31756w(aaVar));
                if (!C31714bf.f85270b) {
                    synchronized (C31714bf.f85269a) {
                        if (!C31714bf.f85270b) {
                            if (C144013m.m234193b()) {
                                context.registerReceiver(new C31714bf(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new C31714bf(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                            C31714bf.f85270b = true;
                        }
                    }
                }
                Objects.requireNonNull(aaVar);
                ((ConcurrentHashMap) C31700as.f85236a.f85157a).putIfAbsent(azVar, new C31757x(aaVar));
            } else {
                aaVar = aaVar2;
            }
        }
        boolean z = aaVar.f85199g;
        return aaVar;
    }
}
