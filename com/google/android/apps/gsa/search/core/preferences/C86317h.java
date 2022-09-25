package com.google.android.apps.gsa.search.core.preferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91385o;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p375ai.p378b.C8078us;
import com.google.p375ai.p378b.C8098vl;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.h */
/* compiled from: PG */
public final class C86317h {

    /* renamed from: a */
    public static final C59071e f233378a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.h");

    /* renamed from: b */
    public final Object f233379b = new Object();

    /* renamed from: c */
    public final SharedPreferences f233380c;

    /* renamed from: d */
    public final C91385o f233381d;

    /* renamed from: e */
    public C86316g f233382e;

    /* renamed from: f */
    public final String f233383f;

    /* renamed from: g */
    private final Context f233384g;

    /* renamed from: h */
    private final C118561t f233385h;

    /* renamed from: i */
    private final C84486a f233386i;

    public C86317h(Context context, SharedPreferences sharedPreferences, C91385o oVar, String str, C118561t tVar, C84486a aVar) {
        this.f233384g = context;
        this.f233380c = sharedPreferences;
        this.f233381d = oVar;
        this.f233383f = str;
        this.f233385h = tVar;
        this.f233386i = aVar;
    }

    /* renamed from: a */
    public final C8078us mo80033a() {
        synchronized (this.f233379b) {
            C86316g gVar = this.f233382e;
            if (gVar != null) {
                C8078us a = gVar.mo80031a();
                return a;
            }
            String string = this.f233380c.getString(this.f233383f, (String) null);
            if (string == null) {
                return null;
            }
            C8078us usVar = (C8078us) C8098vl.f28472k.createBuilder();
            try {
                usVar.mergeFrom(Base64.decode(string, 3), C62921ba.m95368a());
                C86316g gVar2 = new C86316g(usVar);
                this.f233382e = gVar2;
                C8078us a2 = gVar2.mo80031a();
                return a2;
            } catch (C62974ct e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        return r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.p375ai.p378b.C8098vl mo80034b() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f233379b
            monitor-enter(r0)
            com.google.android.apps.gsa.search.core.preferences.g r1 = r2.f233382e     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x000d
            com.google.ai.b.vl r1 = r1.mo80032b()     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return r1
        L_0x000d:
            com.google.ai.b.us r1 = r2.mo80033a()     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0015
            r1 = 0
            goto L_0x001b
        L_0x0015:
            com.google.protobuf.bv r1 = r1.build()     // Catch:{ all -> 0x001d }
            com.google.ai.b.vl r1 = (com.google.p375ai.p378b.C8098vl) r1     // Catch:{ all -> 0x001d }
        L_0x001b:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return r1
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86317h.mo80034b():com.google.ai.b.vl");
    }

    /* renamed from: c */
    public final void mo80035c(C8098vl vlVar) {
        synchronized (this.f233379b) {
            this.f233382e = new C86316g((C8078us) vlVar.toBuilder());
            this.f233380c.edit().remove(this.f233383f).apply();
        }
    }

    /* renamed from: d */
    public final void mo80036d() {
        C86316g gVar = this.f233382e;
        if (gVar != null) {
            this.f233380c.edit().putString(this.f233383f, Base64.encodeToString(gVar.mo80032b().toByteArray(), 3)).apply();
            return;
        }
        C59104x c = f233378a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "NowConfigurationPrefs");
        ((C59052c) ((C59052c) c).mo56372aa(8306)).mo56386p("setConfigurationDirtyLocked: null backing configuration");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        return 0;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo80037e() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f233379b
            monitor-enter(r0)
            com.google.ai.b.vl r1 = r3.mo80034b()     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001a
            int r2 = r1.f28474a     // Catch:{ all -> 0x001d }
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x001a
            int r1 = r1.f28479f     // Catch:{ all -> 0x001d }
            int r1 = com.google.p375ai.p378b.C8097vk.m22936a(r1)     // Catch:{ all -> 0x001d }
            if (r1 != 0) goto L_0x0018
            r1 = 2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return r1
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            r0 = 0
            return r0
        L_0x001d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86317h.mo80037e():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r4.f233386i.mo78201h() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r5 = r4.f233385h;
        r0 = com.google.android.apps.gsa.tasks.C118522by.LEGACY_NOW_SYNC;
        r1 = (com.google.android.apps.gsa.tasks.C118471af) com.google.android.apps.gsa.tasks.C118472ag.f328819i.createBuilder();
        r1.copyOnWrite();
        r2 = (com.google.android.apps.gsa.tasks.C118472ag) r1.instance;
        r2.f328824d = 1;
        r2.f328821a |= 4;
        r5.mo103754e(r0, (com.google.android.apps.gsa.tasks.C118472ag) r1.build());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006b, code lost:
        r5 = new android.content.Intent();
        r5.setPackage(r4.f233384g.getPackageName());
        r5.setAction("com.google.android.apps.gsa.broadcastreceiverACTION_SMARTSPACE_WEATHER_UNIT_CHANGED");
        com.google.android.apps.gsa.broadcastreceiver.C74445c.m120396c(r4.f233384g, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0083, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo80038f(int r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f233379b
            monitor-enter(r0)
            com.google.ai.b.us r1 = r4.mo80033a()     // Catch:{ all -> 0x0084 }
            if (r1 != 0) goto L_0x0027
            com.google.common.f.e r5 = f233378a     // Catch:{ all -> 0x0084 }
            com.google.common.f.x r5 = r5.mo56226d()     // Catch:{ all -> 0x0084 }
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = "NowConfigurationPrefs"
            r5.mo56378ag(r1, r2)     // Catch:{ all -> 0x0084 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0084 }
            r1 = 8309(0x2075, float:1.1643E-41)
            com.google.common.f.x r5 = r5.mo56372aa(r1)     // Catch:{ all -> 0x0084 }
            com.google.common.f.c r5 = (com.google.common.p4526f.C59052c) r5     // Catch:{ all -> 0x0084 }
            java.lang.String r1 = "Attempt to write weather units without backing configuration"
            r5.mo56386p(r1)     // Catch:{ all -> 0x0084 }
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            return
        L_0x0027:
            r1.copyOnWrite()     // Catch:{ all -> 0x0084 }
            com.google.protobuf.bv r1 = r1.instance     // Catch:{ all -> 0x0084 }
            com.google.ai.b.vl r1 = (com.google.p375ai.p378b.C8098vl) r1     // Catch:{ all -> 0x0084 }
            com.google.ai.b.vl r2 = com.google.p375ai.p378b.C8098vl.f28472k     // Catch:{ all -> 0x0084 }
            int r5 = r5 + -1
            r1.f28479f = r5     // Catch:{ all -> 0x0084 }
            int r5 = r1.f28474a     // Catch:{ all -> 0x0084 }
            r5 = r5 | 256(0x100, float:3.59E-43)
            r1.f28474a = r5     // Catch:{ all -> 0x0084 }
            r4.mo80036d()     // Catch:{ all -> 0x0084 }
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            com.google.android.apps.gsa.search.core.ag.b.a r5 = r4.f233386i
            boolean r5 = r5.mo78201h()
            if (r5 == 0) goto L_0x006b
            com.google.android.apps.gsa.tasks.t r5 = r4.f233385h
            com.google.android.apps.gsa.tasks.by r0 = com.google.android.apps.gsa.tasks.C118522by.LEGACY_NOW_SYNC
            com.google.android.apps.gsa.tasks.ag r1 = com.google.android.apps.gsa.tasks.C118472ag.f328819i
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.tasks.af r1 = (com.google.android.apps.gsa.tasks.C118471af) r1
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.apps.gsa.tasks.ag r2 = (com.google.android.apps.gsa.tasks.C118472ag) r2
            r3 = 1
            r2.f328824d = r3
            int r3 = r2.f328821a
            r3 = r3 | 4
            r2.f328821a = r3
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.tasks.ag r1 = (com.google.android.apps.gsa.tasks.C118472ag) r1
            r5.mo103754e(r0, r1)
        L_0x006b:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Context r0 = r4.f233384g
            java.lang.String r0 = r0.getPackageName()
            r5.setPackage(r0)
            java.lang.String r0 = "com.google.android.apps.gsa.broadcastreceiverACTION_SMARTSPACE_WEATHER_UNIT_CHANGED"
            r5.setAction(r0)
            android.content.Context r0 = r4.f233384g
            com.google.android.apps.gsa.broadcastreceiver.C74445c.m120396c(r0, r5)
            return
        L_0x0084:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0084 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.core.preferences.C86317h.mo80038f(int):void");
    }
}
