package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.evernote.android.state.BuildConfig;
import com.google.common.p4522b.C58557jl;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.knowledge.p4661a.p4662a.C61758t;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63378v;
import com.google.protos.p4850an.p4854c.C63402ac;
import com.google.protos.p4850an.p4854c.C63408ai;
import p3186j$.time.LocalDate;
import p3186j$.time.LocalDateTime;
import p3186j$.time.LocalTime;
import p3186j$.time.chrono.ChronoLocalDate;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.z */
/* compiled from: PG */
public final class C33104z implements C33102x {

    /* renamed from: a */
    public Optional f88621a = Optional.empty();

    /* renamed from: b */
    public Optional f88622b = Optional.empty();

    /* renamed from: c */
    public Optional f88623c = Optional.empty();

    /* renamed from: d */
    private final boolean f88624d;

    /* renamed from: e */
    private final boolean f88625e;

    /* renamed from: f */
    private final C61752n f88626f;

    /* renamed from: g */
    private final LocalDateTime f88627g;

    /* renamed from: h */
    private Optional f88628h = Optional.empty();

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C33104z(com.google.knowledge.p4661a.p4662a.C61752n r5, boolean r6, boolean r7, com.google.common.p4580v.C60950i r8) {
        /*
            r4 = this;
            r4.<init>()
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r4.f88621a = r0
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r4.f88622b = r0
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r4.f88628h = r0
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            r4.f88623c = r0
            r4.f88624d = r6
            r4.f88625e = r7
            r4.f88626f = r5
            j$.time.ZoneId r6 = p3186j$.time.ZoneId.systemDefault()
            j$.time.LocalDateTime r6 = r8.mo57446c(r6)
            r4.f88627g = r6
            if (r5 == 0) goto L_0x00bc
            r5 = 0
            r6 = 0
        L_0x002f:
            com.google.knowledge.a.a.n r7 = r4.f88626f
            com.google.protobuf.cq r7 = r7.f166812c
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x00bc
            com.google.knowledge.a.a.n r7 = r4.f88626f
            com.google.protobuf.cq r7 = r7.f166812c
            java.lang.Object r7 = r7.get(r6)
            com.google.knowledge.a.a.h r7 = (com.google.knowledge.p4661a.p4662a.C61746h) r7
            int r8 = r7.f166793a
            r8 = r8 & 4
            if (r8 == 0) goto L_0x00b8
            java.lang.String r8 = r7.f166796d
            int r0 = r8.hashCode()
            r1 = 2
            r2 = 3
            r3 = 1
            switch(r0) {
                case 110371416: goto L_0x0074;
                case 1778391856: goto L_0x006a;
                case 1793702779: goto L_0x0060;
                case 1901043637: goto L_0x0056;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x007e
        L_0x0056:
            java.lang.String r0 = "location"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x007e
            r8 = 3
            goto L_0x007f
        L_0x0060:
            java.lang.String r0 = "datetime"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x007e
            r8 = 1
            goto L_0x007f
        L_0x006a:
            java.lang.String r0 = "recurrence"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x007e
            r8 = 2
            goto L_0x007f
        L_0x0074:
            java.lang.String r0 = "title"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x007e
            r8 = 0
            goto L_0x007f
        L_0x007e:
            r8 = -1
        L_0x007f:
            if (r8 == 0) goto L_0x00a8
            if (r8 == r3) goto L_0x00a1
            if (r8 == r1) goto L_0x009a
            if (r8 == r2) goto L_0x0088
            goto L_0x00b8
        L_0x0088:
            com.google.knowledge.a.a.j r8 = r7.f166797e
            if (r8 != 0) goto L_0x008e
            com.google.knowledge.a.a.j r8 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x008e:
            int r8 = r8.f166802a
            r0 = 5
            if (r8 != r0) goto L_0x00b8
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            r4.f88623c = r7
            goto L_0x00b8
        L_0x009a:
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            r4.f88628h = r7
            goto L_0x00b8
        L_0x00a1:
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            r4.f88622b = r7
            goto L_0x00b8
        L_0x00a8:
            com.google.knowledge.a.a.j r8 = r7.f166797e
            if (r8 != 0) goto L_0x00ae
            com.google.knowledge.a.a.j r8 = com.google.knowledge.p4661a.p4662a.C61748j.f166800d
        L_0x00ae:
            int r8 = r8.f166802a
            if (r8 != r2) goto L_0x00b8
            j$.util.Optional r7 = p3186j$.util.Optional.m71637of(r7)
            r4.f88621a = r7
        L_0x00b8:
            int r6 = r6 + 1
            goto L_0x002f
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33104z.<init>(com.google.knowledge.a.a.n, boolean, boolean, com.google.common.v.i):void");
    }

    /* renamed from: g */
    private final Optional m61413g() {
        C63360d dVar;
        if (!this.f88622b.isPresent() || (((C61746h) this.f88622b.get()).f166793a & 4) == 0) {
            return Optional.empty();
        }
        C61748j jVar = ((C61746h) this.f88622b.get()).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 4) {
            dVar = (C63360d) jVar.f166803b;
        } else {
            dVar = C63360d.f171230f;
        }
        return Optional.m71637of((C63358b) C58557jl.m90130k(dVar.f171234c, C63358b.f171216l));
    }

    /* renamed from: a */
    public final Optional mo38523a() {
        Optional g = m61413g();
        if (g.isPresent()) {
            int i = 1;
            if (!((((C63358b) g.get()).f171218a & 1) == 0 || (((C63358b) g.get()).f171218a & 2) == 0 || (((C63358b) g.get()).f171218a & 4) == 0)) {
                int i2 = ((C63358b) g.get()).f171219b;
                int a = C63378v.m96231a(((C63358b) g.get()).f171220c);
                if (a != 0) {
                    i = a;
                }
                return Optional.m71637of(LocalDate.m71157of(i2, i - 1, ((C63358b) g.get()).f171221d));
            }
        }
        return Optional.empty();
    }

    /* renamed from: b */
    public final boolean mo38524b() {
        Optional a = mo38523a();
        if (this.f88624d) {
            return false;
        }
        if (this.f88625e) {
            return true;
        }
        if (!a.isPresent()) {
            return false;
        }
        return this.f88628h.isPresent() || ((LocalDate) a.get()).compareTo((ChronoLocalDate) this.f88627g.mo43126j()) >= 0;
    }

    /* renamed from: c */
    public final boolean mo38525c() {
        C63408ai aiVar;
        if (!this.f88624d || !this.f88623c.isPresent()) {
            return false;
        }
        C61748j jVar = ((C61746h) this.f88623c.get()).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 5) {
            aiVar = (C63408ai) jVar.f166803b;
        } else {
            aiVar = C63408ai.f171351e;
        }
        C63402ac acVar = aiVar.f171354b;
        if (acVar == null) {
            acVar = C63402ac.f171336b;
        }
        return Collection.EL.stream(acVar.f171338a).anyMatch(C33103y.f88620a);
    }

    /* renamed from: d */
    public final boolean mo38526d() {
        Optional optional;
        if (this.f88624d) {
            return false;
        }
        if (this.f88625e) {
            return true;
        }
        Optional g = m61413g();
        if (!g.isPresent() || (((C63358b) g.get()).f171218a & 16) == 0) {
            optional = Optional.empty();
        } else {
            optional = Optional.m71637of(LocalTime.m71211of(((C63358b) g.get()).f171222e, ((C63358b) g.get()).f171223f));
        }
        if (!optional.isPresent()) {
            return false;
        }
        return mo38527e((LocalTime) optional.get());
    }

    /* renamed from: e */
    public final boolean mo38527e(LocalTime localTime) {
        if (this.f88624d) {
            return false;
        }
        if (this.f88625e) {
            return true;
        }
        Optional a = mo38523a();
        if (this.f88628h.isPresent() || !a.isPresent() || !mo38524b() || ((LocalDate) a.get()).compareTo((ChronoLocalDate) this.f88627g.mo43126j()) > 0) {
            return true;
        }
        return ((LocalDate) a.get()).compareTo((ChronoLocalDate) this.f88627g.mo43126j()) == 0 && localTime.compareTo(this.f88627g.toLocalTime()) >= 0;
    }

    /* renamed from: f */
    public final boolean mo38528f() {
        C61758t tVar;
        if (!this.f88621a.isPresent()) {
            return false;
        }
        C61748j jVar = ((C61746h) this.f88621a.get()).f166797e;
        if (jVar == null) {
            jVar = C61748j.f166800d;
        }
        if (jVar.f166802a == 3) {
            tVar = (C61758t) jVar.f166803b;
        } else {
            tVar = C61758t.f166824c;
        }
        if (!(tVar.f166826a == 1 ? (String) tVar.f166827b : BuildConfig.FLAVOR).isEmpty()) {
            return true;
        }
        return false;
    }
}
