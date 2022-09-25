package android.support.constraint.p029a.p030a;

import android.support.constraint.p029a.C0144g;
import com.evernote.android.state.BuildConfig;
import java.util.HashSet;

/* renamed from: android.support.constraint.a.a.b */
/* compiled from: PG */
public final class C0132b {

    /* renamed from: a */
    final C0133c f404a;

    /* renamed from: b */
    C0132b f405b;

    /* renamed from: c */
    public int f406c = 0;

    /* renamed from: d */
    int f407d = -1;

    /* renamed from: e */
    public int f408e = 0;

    /* renamed from: f */
    public C0144g f409f;

    /* renamed from: g */
    final int f410g;

    /* renamed from: h */
    public int f411h = 1;

    /* renamed from: i */
    public int f412i = 1;

    public C0132b(C0133c cVar, int i) {
        this.f404a = cVar;
        this.f410g = i;
    }

    /* renamed from: f */
    private final String m153f(HashSet hashSet) {
        if (!hashSet.add(this)) {
            return "<-";
        }
        StringBuilder sb = new StringBuilder("null:");
        sb.append(C0131a.m152a(this.f410g));
        C0132b bVar = this.f405b;
        sb.append(bVar != null ? " connected to ".concat(bVar.m153f(hashSet)) : BuildConfig.FLAVOR);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r2 = r3.f405b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo123a() {
        /*
            r3 = this;
            android.support.constraint.a.a.c r0 = r3.f404a
            int r0 = r0.f425M
            r1 = 8
            if (r0 != r1) goto L_0x000a
            r0 = 0
            return r0
        L_0x000a:
            int r0 = r3.f407d
            if (r0 < 0) goto L_0x0019
            android.support.constraint.a.a.b r2 = r3.f405b
            if (r2 == 0) goto L_0x0019
            android.support.constraint.a.a.c r2 = r2.f404a
            int r2 = r2.f425M
            if (r2 != r1) goto L_0x0019
            return r0
        L_0x0019:
            int r0 = r3.f406c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0132b.mo123a():int");
    }

    /* renamed from: b */
    public final void mo124b() {
        this.f405b = null;
        this.f406c = 0;
        this.f407d = -1;
        this.f411h = 2;
        this.f408e = 0;
        this.f412i = 1;
    }

    /* renamed from: c */
    public final boolean mo125c() {
        return this.f405b != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (r15 != 9) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r15 != 8) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0077, code lost:
        r3 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo126d(android.support.constraint.p029a.p030a.C0132b r10, int r11, int r12, int r13, int r14, boolean r15) {
        /*
            r9 = this;
            r0 = -1
            r1 = 2
            r2 = 0
            r3 = 1
            if (r10 != 0) goto L_0x0012
            r10 = 0
            r9.f405b = r10
            r9.f406c = r2
            r9.f407d = r0
            r9.f411h = r3
            r9.f408e = r1
            return
        L_0x0012:
            if (r15 != 0) goto L_0x007d
            int r15 = r10.f410g
            int r4 = r9.f410g
            r5 = 6
            if (r15 != r4) goto L_0x0033
            r15 = 7
            if (r4 != r15) goto L_0x0020
            goto L_0x007c
        L_0x0020:
            if (r4 != r5) goto L_0x007d
            android.support.constraint.a.a.c r15 = r10.f404a
            boolean r15 = r15.mo143o()
            if (r15 == 0) goto L_0x007c
            android.support.constraint.a.a.c r15 = r9.f404a
            boolean r15 = r15.mo143o()
            if (r15 == 0) goto L_0x007c
            goto L_0x007d
        L_0x0033:
            int r4 = r4 + r0
            r0 = 8
            r6 = 4
            if (r4 == r3) goto L_0x0063
            r7 = 9
            r8 = 3
            if (r4 == r1) goto L_0x004c
            if (r4 == r8) goto L_0x0063
            if (r4 == r6) goto L_0x004c
            if (r4 == r5) goto L_0x0045
            goto L_0x007c
        L_0x0045:
            if (r15 == r5) goto L_0x007c
            if (r15 == r0) goto L_0x007c
            if (r15 == r7) goto L_0x007c
            goto L_0x007d
        L_0x004c:
            if (r15 == r8) goto L_0x0055
            r0 = 5
            if (r15 != r0) goto L_0x0053
            r15 = 5
            goto L_0x0055
        L_0x0053:
            r0 = 0
            goto L_0x0056
        L_0x0055:
            r0 = 1
        L_0x0056:
            android.support.constraint.a.a.c r1 = r10.f404a
            boolean r1 = r1 instanceof android.support.constraint.p029a.p030a.C0135e
            if (r1 == 0) goto L_0x0061
            if (r0 != 0) goto L_0x007a
            if (r15 != r7) goto L_0x0077
            goto L_0x007a
        L_0x0061:
            r3 = r0
            goto L_0x007a
        L_0x0063:
            if (r15 == r1) goto L_0x006b
            if (r15 != r6) goto L_0x0069
            r15 = 4
            goto L_0x006b
        L_0x0069:
            r1 = 0
            goto L_0x006c
        L_0x006b:
            r1 = 1
        L_0x006c:
            android.support.constraint.a.a.c r4 = r10.f404a
            boolean r4 = r4 instanceof android.support.constraint.p029a.p030a.C0135e
            if (r4 == 0) goto L_0x0079
            if (r1 != 0) goto L_0x007a
            if (r15 != r0) goto L_0x0077
            goto L_0x007a
        L_0x0077:
            r3 = 0
            goto L_0x007a
        L_0x0079:
            r3 = r1
        L_0x007a:
            if (r3 != 0) goto L_0x007d
        L_0x007c:
            return
        L_0x007d:
            r9.f405b = r10
            if (r11 <= 0) goto L_0x0084
            r9.f406c = r11
            goto L_0x0086
        L_0x0084:
            r9.f406c = r2
        L_0x0086:
            r9.f407d = r12
            r9.f411h = r13
            r9.f408e = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.constraint.p029a.p030a.C0132b.mo126d(android.support.constraint.a.a.b, int, int, int, int, boolean):void");
    }

    /* renamed from: e */
    public final void mo127e() {
        C0144g gVar = this.f409f;
        if (gVar == null) {
            this.f409f = new C0144g(1);
        } else {
            gVar.mo185b();
        }
    }

    public final String toString() {
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder("null:");
        sb.append(C0131a.m152a(this.f410g));
        C0132b bVar = this.f405b;
        sb.append(bVar != null ? " connected to ".concat(bVar.m153f(hashSet)) : BuildConfig.FLAVOR);
        return sb.toString();
    }
}
