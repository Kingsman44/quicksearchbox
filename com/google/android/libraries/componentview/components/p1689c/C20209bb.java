package com.google.android.libraries.componentview.components.p1689c;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.libraries.componentview.components.base.C20078ci;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20120aq;
import com.google.android.libraries.componentview.components.p1689c.p1690a.C20121ar;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.components.c.bb */
/* compiled from: PG */
public class C20209bb extends C20078ci {

    /* renamed from: a */
    private C20121ar f56738a;

    public C20209bb(C56425d dVar, C20537f fVar, Context context, Executor executor, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, executor, caVar, atVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20121ar.f56396c);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20121ar arVar = (C20121ar) obj;
        this.f56738a = arVar;
        if (arVar.f56398a.size() != 0) {
            mo25256A(this.f56738a.f56398a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C56425d mo25113i(List list) {
        C20120aq aqVar = (C20120aq) this.f56738a.toBuilder();
        if (list != null) {
            aqVar.copyOnWrite();
            ((C20121ar) aqVar.instance).f56398a = C20121ar.emptyProtobufList();
            aqVar.copyOnWrite();
            C20121ar arVar = (C20121ar) aqVar.instance;
            C62971cq cqVar = arVar.f56398a;
            if (!cqVar.mo58948c()) {
                arVar.f56398a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) arVar.f56398a);
        }
        C56424c cVar = (C56424c) this.f57588z.toBuilder();
        cVar.mo58885m(C20121ar.f56396c, (C20121ar) aqVar.build());
        return (C56425d) cVar.build();
    }

    /* JADX WARNING: type inference failed for: r9v11, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: kC */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo25115kC(int r9, com.google.android.libraries.componentview.p1697d.C20477h r10) {
        /*
            r8 = this;
            r0 = 8
            r1 = 0
            if (r9 != r0) goto L_0x0101
            if (r10 == 0) goto L_0x0101
            boolean r9 = r10 instanceof com.google.android.libraries.componentview.components.p1689c.C20304f
            if (r9 != 0) goto L_0x000d
            goto L_0x0101
        L_0x000d:
            com.google.android.libraries.componentview.components.c.f r10 = (com.google.android.libraries.componentview.components.p1689c.C20304f) r10
            java.lang.Class<com.google.android.libraries.componentview.components.c.ay> r9 = com.google.android.libraries.componentview.components.p1689c.C20205ay.class
            com.google.common.b.gu r9 = r8.mo25422K(r9)
            int r0 = r9.size()
            r2 = 0
        L_0x001a:
            if (r2 >= r0) goto L_0x0059
            java.lang.Object r3 = r9.get(r2)
            com.google.android.libraries.componentview.components.c.ay r3 = (com.google.android.libraries.componentview.components.p1689c.C20205ay) r3
            java.lang.String r4 = r10.mo25349b()
            com.google.bq.d r5 = r3.f57588z
            com.google.protobuf.bt r6 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap.f56376s
            com.google.protobuf.bt r6 = com.google.protobuf.C62942bv.checkIsLite(r6)
            r5.mo58887l(r6)
            com.google.protobuf.bf r5 = r5.f169962ag
            com.google.protobuf.bs r7 = r6.f169971d
            java.lang.Object r5 = r5.mo58854l(r7)
            if (r5 != 0) goto L_0x003e
            java.lang.Object r5 = r6.f169969b
            goto L_0x0042
        L_0x003e:
            java.lang.Object r5 = r6.mo58889c(r5)
        L_0x0042:
            int r2 = r2 + 1
            com.google.android.libraries.componentview.components.c.a.ap r5 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20119ap) r5
            java.lang.String r5 = r5.f56380c
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001a
            android.widget.EditText r9 = r3.f56729a
            android.text.Editable r9 = r9.getText()
            java.lang.String r9 = r9.toString()
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            com.google.android.libraries.componentview.components.c.a.h r0 = r10.mo25348a()
            r2 = 1
            if (r9 == 0) goto L_0x00db
            com.google.android.libraries.componentview.components.c.a.l r3 = r0.f56562b
            if (r3 != 0) goto L_0x0067
            com.google.android.libraries.componentview.components.c.a.l r3 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20166l.f56569c
        L_0x0067:
            java.lang.String r3 = r3.f56572b
            android.net.Uri r3 = android.net.Uri.parse(r3)
            java.lang.String r4 = r3.getScheme()
            java.lang.String r5 = "tel"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0085
            java.lang.String r4 = r3.getScheme()
            java.lang.String r5 = "sms"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00db
        L_0x0085:
            com.google.protobuf.bn r4 = r0.toBuilder()
            com.google.android.libraries.componentview.components.c.a.g r4 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20161g) r4
            com.google.android.libraries.componentview.components.c.a.l r0 = r0.f56562b
            if (r0 != 0) goto L_0x0091
            com.google.android.libraries.componentview.components.c.a.l r0 = com.google.android.libraries.componentview.components.p1689c.p1690a.C20166l.f56569c
        L_0x0091:
            com.google.protobuf.bn r0 = r0.toBuilder()
            com.google.android.libraries.componentview.components.c.a.k r0 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20165k) r0
            java.lang.String r3 = r3.getScheme()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = ":"
            r5.append(r3)
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.android.libraries.componentview.components.c.a.l r3 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20166l) r3
            int r5 = r3.f56571a
            r5 = r5 | r2
            r3.f56571a = r5
            r3.f56572b = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r9 = r4.instance
            com.google.android.libraries.componentview.components.c.a.h r9 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20162h) r9
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.componentview.components.c.a.l r0 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20166l) r0
            r0.getClass()
            r9.f56562b = r0
            int r0 = r9.f56561a
            r0 = r0 | r2
            r9.f56561a = r0
            com.google.protobuf.bv r9 = r4.build()
            r0 = r9
            com.google.android.libraries.componentview.components.c.a.h r0 = (com.google.android.libraries.componentview.components.p1689c.p1690a.C20162h) r0
        L_0x00db:
            java.lang.Class<com.google.android.libraries.componentview.components.c.h> r9 = com.google.android.libraries.componentview.components.p1689c.C20306h.class
            com.google.common.b.gu r9 = r8.mo25422K(r9)
            int r3 = r9.size()
        L_0x00e5:
            if (r1 >= r3) goto L_0x0100
            java.lang.Object r4 = r9.get(r1)
            com.google.android.libraries.componentview.components.c.h r4 = (com.google.android.libraries.componentview.components.p1689c.C20306h) r4
            int r1 = r1 + 1
            java.lang.String r5 = r10.mo25349b()
            com.google.android.libraries.componentview.components.c.a.f r6 = r4.f57051a
            java.lang.String r6 = r6.f56556d
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00e5
            r4.mo25351m(r0)
        L_0x0100:
            return r2
        L_0x0101:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.componentview.components.p1689c.C20209bb.mo25115kC(int, com.google.android.libraries.componentview.d.h):boolean");
    }

    /* renamed from: kJ */
    public final void mo25116kJ() {
    }
}
