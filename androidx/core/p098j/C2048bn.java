package androidx.core.p098j;

import android.view.ViewGroup;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69571i;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5482l.C69733m;

@C69567e(mo61343b = "androidx.core.view.ViewGroupKt$descendants$1", mo61344c = "ViewGroup.kt", mo61345d = "invokeSuspend", mo61346e = {119, 121})
/* renamed from: androidx.core.j.bn */
/* compiled from: PG */
final class C2048bn extends C69571i implements C69630p {

    /* renamed from: a */
    Object f5949a;

    /* renamed from: b */
    Object f5950b;

    /* renamed from: c */
    int f5951c;

    /* renamed from: d */
    int f5952d;

    /* renamed from: e */
    int f5953e;

    /* renamed from: f */
    final /* synthetic */ ViewGroup f5954f;

    /* renamed from: g */
    private /* synthetic */ Object f5955g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2048bn(ViewGroup viewGroup, C69577g gVar) {
        super(gVar);
        this.f5954f = viewGroup;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C2048bn) mo5194c((C69733m) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.view.ViewGroup} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x003b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo5193b(java.lang.Object r11) {
        /*
            r10 = this;
            h.c.a.a r0 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r1 = r10.f5953e
            r2 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 == r2) goto L_0x0019
            int r1 = r10.f5952d
            int r3 = r10.f5951c
            java.lang.Object r4 = r10.f5949a
            java.lang.Object r5 = r10.f5955g
            h.l.m r5 = (p5462h.p5482l.C69733m) r5
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            goto L_0x0080
        L_0x0019:
            int r1 = r10.f5952d
            int r3 = r10.f5951c
            java.lang.Object r4 = r10.f5950b
            java.lang.Object r5 = r10.f5949a
            java.lang.Object r6 = r10.f5955g
            h.l.m r6 = (p5462h.p5482l.C69733m) r6
            p5462h.C69714l.m101134b(r11)
            r11 = r10
            goto L_0x0060
        L_0x002a:
            p5462h.C69714l.m101134b(r11)
            java.lang.Object r11 = r10.f5955g
            h.l.m r11 = (p5462h.p5482l.C69733m) r11
            android.view.ViewGroup r1 = r10.f5954f
            int r3 = r1.getChildCount()
            r4 = 0
            r5 = r10
        L_0x0039:
            if (r4 >= r3) goto L_0x0092
            r6 = r1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            android.view.View r6 = r6.getChildAt(r4)
            java.lang.String r7 = "getChildAt(index)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r7)
            r5.f5955g = r11
            r5.f5949a = r1
            r5.f5950b = r6
            r5.f5951c = r4
            r5.f5952d = r3
            r5.f5953e = r2
            java.lang.Object r7 = r11.mo61426a(r6, r5)
            if (r7 == r0) goto L_0x0091
            r8 = r6
            r6 = r11
            r11 = r5
            r5 = r1
            r1 = r3
            r3 = r4
            r4 = r8
        L_0x0060:
            boolean r7 = r4 instanceof android.view.ViewGroup
            if (r7 == 0) goto L_0x0088
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            h.l.k r4 = androidx.core.p098j.C2050bp.m5610b(r4)
            r11.f5955g = r6
            r11.f5949a = r5
            r7 = 0
            r11.f5950b = r7
            r11.f5951c = r3
            r11.f5952d = r1
            r7 = 2
            r11.f5953e = r7
            java.lang.Object r4 = r6.mo61429d(r4, r11)
            if (r4 == r0) goto L_0x0087
            r4 = r5
            r5 = r6
        L_0x0080:
            r8 = r5
            r5 = r11
            r11 = r8
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x008c
        L_0x0087:
            return r0
        L_0x0088:
            r4 = r1
            r1 = r5
            r5 = r11
            r11 = r6
        L_0x008c:
            int r3 = r3 + r2
            r8 = r4
            r4 = r3
            r3 = r8
            goto L_0x0039
        L_0x0091:
            return r0
        L_0x0092:
            h.q r11 = p5462h.C69788q.f186170a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.p098j.C2048bn.mo5193b(java.lang.Object):java.lang.Object");
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        C2048bn bnVar = new C2048bn(this.f5954f, gVar);
        bnVar.f5955g = obj;
        return bnVar;
    }
}
