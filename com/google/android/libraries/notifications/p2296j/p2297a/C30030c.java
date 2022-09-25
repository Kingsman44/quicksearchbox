package com.google.android.libraries.notifications.p2296j.p2297a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.notifications.p2296j.C30032b;
import com.google.android.libraries.notifications.p2296j.C30034d;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2310d.p2311a.p2312a.C30078a;
import com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30115i;
import com.google.android.libraries.notifications.platform.p2318f.p2330e.C30137b;
import com.google.android.libraries.p1623at.p1631d.C19552a;
import com.google.android.libraries.p1635au.C19567d;
import com.google.common.base.C58833ax;
import com.google.protobuf.MessageLite;
import dagger.C68214a;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68936a;

/* renamed from: com.google.android.libraries.notifications.j.a.c */
/* compiled from: PG */
public final class C30030c {

    /* renamed from: a */
    private static final C19552a f81264a = new C19552a("chime.server.url", BuildConfig.FLAVOR);

    /* renamed from: b */
    private final Context f81265b;

    /* renamed from: c */
    private final C30075e f81266c;

    /* renamed from: d */
    private final C68214a f81267d;

    /* renamed from: e */
    private final C30137b f81268e;

    /* renamed from: f */
    private final C30115i f81269f;

    /* renamed from: g */
    private final C30078a f81270g;

    public C30030c(Context context, C30115i iVar, C30075e eVar, C68214a aVar, C30137b bVar, C30078a aVar2) {
        this.f81265b = context;
        this.f81269f = iVar;
        this.f81266c = eVar;
        this.f81267d = aVar;
        this.f81268e = bVar;
        this.f81270g = aVar2;
    }

    /* renamed from: a */
    public final C30034d mo35359a(String str, String str2, MessageLite messageLite, MessageLite messageLite2) {
        C30034d b = m55705b(str, str2, messageLite, messageLite2, false);
        if (C68936a.f185223a.mo6453a().mo60798b() && ((C30032b) b).f81272b) {
            C30058b.m55789a("HttpRpcExecutor", "Request to %s for %s, failed with auth error, refreshing auth token and retrying", str, str2);
            b = m55705b(str, str2, messageLite, messageLite2, true);
        }
        C30137b bVar = this.f81268e;
        ((C19567d) bVar.f81508b.mo6453a()).mo24822a(1, this.f81265b.getPackageName(), str, Integer.valueOf(((Integer) C58833ax.m90833j(((C30032b) b).f81271a).mo56109e(-1)).intValue()));
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0184, code lost:
        if (((com.google.android.libraries.notifications.platform.p2310d.C30089l) r9).f81420a == 401) goto L_0x0186;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0198 A[Catch:{ Exception -> 0x01f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0199 A[Catch:{ Exception -> 0x01f0 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.libraries.notifications.p2296j.C30034d m55705b(java.lang.String r7, java.lang.String r8, com.google.protobuf.MessageLite r9, com.google.protobuf.MessageLite r10, boolean r11) {
        /*
            r6 = this;
            r9.getClass()
            r10.getClass()
            r0 = 0
            byte[] r9 = r9.toByteArray()     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.d.b r1 = new com.google.android.libraries.notifications.platform.d.b     // Catch:{ Exception -> 0x01f0 }
            r1.<init>()     // Catch:{ Exception -> 0x01f0 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ Exception -> 0x01f0 }
            r2.<init>()     // Catch:{ Exception -> 0x01f0 }
            r1.f81400c = r2     // Catch:{ Exception -> 0x01f0 }
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.c.e r3 = r6.f81266c     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.at.d.a r4 = f81264a     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r4 = r4.mo24804a()     // Catch:{ Exception -> 0x01f0 }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x01f0 }
            if (r5 == 0) goto L_0x002e
            com.google.android.libraries.notifications.platform.c.a r3 = (com.google.android.libraries.notifications.platform.p2309c.C30071a) r3     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.c.d r3 = r3.f81357c     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r3 = r3.f81395g     // Catch:{ Exception -> 0x01f0 }
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = "https://"
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ Exception -> 0x01f0 }
        L_0x0038:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f0 }
            r4.<init>()     // Catch:{ Exception -> 0x01f0 }
            r4.append(r3)     // Catch:{ Exception -> 0x01f0 }
            r4.append(r7)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = r4.toString()     // Catch:{ Exception -> 0x01f0 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x01f0 }
            r1.f81398a = r2     // Catch:{ Exception -> 0x01f0 }
            r1.f81401d = r9     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = "application/x-protobuf"
            r1.f81399b = r7     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.d.a.a.a r7 = r6.f81270g     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = p5304e.p5305a.p5306a.p5409o.p5410a.C68955s.m100015c()     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "androidIdentitySignature()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            int r9 = r9.length()     // Catch:{ Exception -> 0x01f0 }
            if (r9 <= 0) goto L_0x00dd
            android.content.Context r7 = r7.f81397a     // Catch:{ Exception -> 0x01f0 }
            android.content.ContentResolver r7 = r7.getContentResolver()     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = "context.contentResolver"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r9)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = "contentResolver"
            p5462h.p5473f.p5475b.C69664n.m101061g(r7, r9)     // Catch:{ Exception -> 0x01f0 }
            r2 = 0
            long r4 = com.google.android.p10905k.C146606e.m238845g(r7, r2)     // Catch:{ Exception -> 0x01f0 }
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x00dd
            com.google.android.libraries.notifications.platform.d.g r7 = com.google.android.libraries.notifications.platform.p2310d.C30084g.f81417b     // Catch:{ Exception -> 0x01f0 }
            r9 = 16
            p5462h.p5483m.C69748a.m101208b(r9)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = java.lang.Long.toString(r4, r9)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            r1.mo35485b(r7, r9)     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.d.g r7 = com.google.android.libraries.notifications.platform.p2310d.C30084g.f81418c     // Catch:{ Exception -> 0x01f0 }
            com.google.cm.a.a.a.a.b r9 = com.google.p4500cm.p4501a.p4502a.p4503a.p4504a.C58138b.f155425c     // Catch:{ Exception -> 0x01f0 }
            com.google.protobuf.bn r9 = r9.createBuilder()     // Catch:{ Exception -> 0x01f0 }
            com.google.cm.a.a.a.a.a r9 = (com.google.p4500cm.p4501a.p4502a.p4503a.p4504a.C58137a) r9     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "newBuilder()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "builder"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = p5304e.p5305a.p5306a.p5409o.p5410a.C68955s.m100015c()     // Catch:{ Exception -> 0x01f0 }
            com.google.protobuf.z r2 = com.google.protobuf.C63088z.m96143E(r2)     // Catch:{ Exception -> 0x01f0 }
            r9.copyOnWrite()     // Catch:{ Exception -> 0x01f0 }
            com.google.protobuf.bv r3 = r9.instance     // Catch:{ Exception -> 0x01f0 }
            com.google.cm.a.a.a.a.b r3 = (com.google.p4500cm.p4501a.p4502a.p4503a.p4504a.C58138b) r3     // Catch:{ Exception -> 0x01f0 }
            int r4 = r3.f155427a     // Catch:{ Exception -> 0x01f0 }
            r4 = r4 | 8
            r3.f155427a = r4     // Catch:{ Exception -> 0x01f0 }
            r3.f155428b = r2     // Catch:{ Exception -> 0x01f0 }
            com.google.protobuf.bv r9 = r9.build()     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "_builder.build()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            com.google.cm.a.a.a.a.b r9 = (com.google.p4500cm.p4501a.p4502a.p4503a.p4504a.C58138b) r9     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "<this>"
            p5462h.p5473f.p5475b.C69664n.m101061g(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            byte[] r9 = r9.toByteArray()     // Catch:{ Exception -> 0x01f0 }
            r2 = 10
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = "encodeToString(toByteArr…L_SAFE or Base64.NO_WRAP)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r9, r2)     // Catch:{ Exception -> 0x01f0 }
            r1.mo35485b(r7, r9)     // Catch:{ Exception -> 0x01f0 }
        L_0x00dd:
            boolean r7 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x01f0 }
            r9 = 0
            if (r7 != 0) goto L_0x0120
            if (r11 == 0) goto L_0x0100
            com.google.android.libraries.notifications.platform.f.a.a.i r7 = r6.f81269f     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r11 = "accountName"
            p5462h.p5473f.p5475b.C69664n.m101061g(r8, r11)     // Catch:{ Exception -> 0x01f0 }
            kotlinx.coroutines.aw r11 = r7.f81464b     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.f.a.a.h r2 = new com.google.android.libraries.notifications.platform.f.a.a.h     // Catch:{ Exception -> 0x01f0 }
            r2.<init>(r7, r8, r9)     // Catch:{ Exception -> 0x01f0 }
            r7 = 3
            com.google.common.util.concurrent.cx r7 = kotlinx.coroutines.p5578d.C71663i.m104692e(r11, r9, r2, r7)     // Catch:{ Exception -> 0x01f0 }
            java.lang.Object r7 = r7.get()     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.f.a.a.f r7 = (com.google.android.libraries.notifications.platform.p2318f.p2319a.p2320a.C30112f) r7     // Catch:{ Exception -> 0x01f0 }
            goto L_0x0108
        L_0x0100:
            com.google.android.libraries.notifications.platform.f.a.a.i r7 = r6.f81269f     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = "oauth2:https://www.googleapis.com/auth/notifications"
            com.google.android.libraries.notifications.platform.f.a.a.f r7 = r7.mo35515a(r8, r9)     // Catch:{ Exception -> 0x01f0 }
        L_0x0108:
            java.lang.String r8 = "Authorization"
            com.google.android.libraries.notifications.platform.d.g r8 = com.google.android.libraries.notifications.platform.p2310d.C30084g.m55892b(r8)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = "Bearer "
            java.lang.String r7 = r7.mo35514a()     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = r9.concat(r7)     // Catch:{ Exception -> 0x01f0 }
            r1.mo35485b(r8, r7)     // Catch:{ Exception -> 0x01f0 }
            goto L_0x012f
        L_0x0120:
            boolean r7 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x01f0 }
            if (r7 != 0) goto L_0x01e8
            java.lang.String r7 = "X-Goog-Api-Key"
            com.google.android.libraries.notifications.platform.d.g r7 = com.google.android.libraries.notifications.platform.p2310d.C30084g.m55892b(r7)     // Catch:{ Exception -> 0x01f0 }
            r1.mo35485b(r7, r9)     // Catch:{ Exception -> 0x01f0 }
        L_0x012f:
            dagger.a r7 = r6.f81267d     // Catch:{ Exception -> 0x01f0 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.d.f r7 = (com.google.android.libraries.notifications.platform.p2310d.C30083f) r7     // Catch:{ Exception -> 0x01f0 }
            java.net.URL r8 = r1.f81398a     // Catch:{ Exception -> 0x01f0 }
            if (r8 == 0) goto L_0x01c1
            java.util.Map r9 = r1.f81400c     // Catch:{ Exception -> 0x01f0 }
            if (r9 != 0) goto L_0x0141
            goto L_0x01c1
        L_0x0141:
            com.google.android.libraries.notifications.platform.d.c r11 = new com.google.android.libraries.notifications.platform.d.c     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r2 = r1.f81399b     // Catch:{ Exception -> 0x01f0 }
            byte[] r1 = r1.f81401d     // Catch:{ Exception -> 0x01f0 }
            r11.<init>(r8, r2, r9, r1)     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.platform.d.k r7 = r7.mo35484a(r11)     // Catch:{ Exception -> 0x01f0 }
            java.lang.Throwable r8 = r7.mo35487h()     // Catch:{ Exception -> 0x01f0 }
            if (r8 == 0) goto L_0x01a2
            com.google.android.libraries.notifications.j.a r8 = com.google.android.libraries.notifications.p2296j.C30034d.m55723f()     // Catch:{ Exception -> 0x01f0 }
            java.lang.Integer r9 = r7.mo35476b()     // Catch:{ Exception -> 0x01f0 }
            r8.f81257a = r9     // Catch:{ Exception -> 0x01f0 }
            java.lang.Throwable r9 = r7.mo35487h()     // Catch:{ Exception -> 0x01f0 }
            r8.f81259c = r9     // Catch:{ Exception -> 0x01f0 }
            java.lang.Throwable r9 = r7.mo35487h()     // Catch:{ Exception -> 0x01f0 }
            r10 = 401(0x191, float:5.62E-43)
            r11 = 1
            if (r9 != 0) goto L_0x016f
        L_0x016d:
            r9 = 0
            goto L_0x0187
        L_0x016f:
            boolean r1 = r9 instanceof java.net.SocketException     // Catch:{ Exception -> 0x01f0 }
            if (r1 != 0) goto L_0x0186
            boolean r1 = r9 instanceof java.net.UnknownHostException     // Catch:{ Exception -> 0x01f0 }
            if (r1 != 0) goto L_0x0186
            boolean r1 = r9 instanceof javax.net.ssl.SSLException     // Catch:{ Exception -> 0x01f0 }
            if (r1 == 0) goto L_0x017c
            goto L_0x0186
        L_0x017c:
            boolean r1 = r9 instanceof com.google.android.libraries.notifications.platform.p2310d.C30089l     // Catch:{ Exception -> 0x01f0 }
            if (r1 == 0) goto L_0x016d
            com.google.android.libraries.notifications.platform.d.l r9 = (com.google.android.libraries.notifications.platform.p2310d.C30089l) r9     // Catch:{ Exception -> 0x01f0 }
            int r9 = r9.f81420a     // Catch:{ Exception -> 0x01f0 }
            if (r9 != r10) goto L_0x016d
        L_0x0186:
            r9 = 1
        L_0x0187:
            r8.mo35349c(r9)     // Catch:{ Exception -> 0x01f0 }
            java.lang.Throwable r7 = r7.mo35487h()     // Catch:{ Exception -> 0x01f0 }
            boolean r9 = r7 instanceof com.google.android.libraries.notifications.platform.p2310d.C30089l     // Catch:{ Exception -> 0x01f0 }
            if (r9 == 0) goto L_0x0199
            com.google.android.libraries.notifications.platform.d.l r7 = (com.google.android.libraries.notifications.platform.p2310d.C30089l) r7     // Catch:{ Exception -> 0x01f0 }
            int r7 = r7.f81420a     // Catch:{ Exception -> 0x01f0 }
            if (r7 != r10) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r11 = 0
        L_0x019a:
            r8.mo35348b(r11)     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.j.d r7 = r8.mo35347a()     // Catch:{ Exception -> 0x01f0 }
            return r7
        L_0x01a2:
            com.google.protobuf.eb r8 = r10.getParserForType()     // Catch:{ Exception -> 0x01f0 }
            byte[] r9 = r7.mo35479e()     // Catch:{ Exception -> 0x01f0 }
            java.lang.Object r8 = r8.mo59010i(r9)     // Catch:{ Exception -> 0x01f0 }
            com.google.protobuf.MessageLite r8 = (com.google.protobuf.MessageLite) r8     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.j.a r9 = com.google.android.libraries.notifications.p2296j.C30034d.m55723f()     // Catch:{ Exception -> 0x01f0 }
            java.lang.Integer r7 = r7.mo35476b()     // Catch:{ Exception -> 0x01f0 }
            r9.f81257a = r7     // Catch:{ Exception -> 0x01f0 }
            r9.f81258b = r8     // Catch:{ Exception -> 0x01f0 }
            com.google.android.libraries.notifications.j.d r7 = r9.mo35347a()     // Catch:{ Exception -> 0x01f0 }
            return r7
        L_0x01c1:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01f0 }
            r7.<init>()     // Catch:{ Exception -> 0x01f0 }
            java.net.URL r8 = r1.f81398a     // Catch:{ Exception -> 0x01f0 }
            if (r8 != 0) goto L_0x01cf
            java.lang.String r8 = " url"
            r7.append(r8)     // Catch:{ Exception -> 0x01f0 }
        L_0x01cf:
            java.util.Map r8 = r1.f81400c     // Catch:{ Exception -> 0x01f0 }
            if (r8 != 0) goto L_0x01d8
            java.lang.String r8 = " headers"
            r7.append(r8)     // Catch:{ Exception -> 0x01f0 }
        L_0x01d8:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r9 = "Missing required properties:"
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r7 = r9.concat(r7)     // Catch:{ Exception -> 0x01f0 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x01f0 }
            throw r8     // Catch:{ Exception -> 0x01f0 }
        L_0x01e8:
            java.lang.Exception r7 = new java.lang.Exception     // Catch:{ Exception -> 0x01f0 }
            java.lang.String r8 = "One of Account Name or API Key must be set."
            r7.<init>(r8)     // Catch:{ Exception -> 0x01f0 }
            throw r7     // Catch:{ Exception -> 0x01f0 }
        L_0x01f0:
            r7 = move-exception
            com.google.android.libraries.notifications.j.a r8 = com.google.android.libraries.notifications.p2296j.C30034d.m55723f()
            r8.f81259c = r7
            r8.mo35349c(r0)
            com.google.android.libraries.notifications.j.d r7 = r8.mo35347a()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.notifications.p2296j.p2297a.C30030c.m55705b(java.lang.String, java.lang.String, com.google.protobuf.MessageLite, com.google.protobuf.MessageLite, boolean):com.google.android.libraries.notifications.j.d");
    }
}
