package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84021p;
import com.google.android.apps.gsa.opaonboarding.p6463ui.C84031z;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.opaonboarding.p6463ui.p6464a.C83973o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cd */
/* compiled from: PG */
public final class C108604cd extends C84021p {

    /* renamed from: d */
    private static final C59071e f302102d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.deviceregistration.cd");

    /* renamed from: b */
    public C108556ar f302103b;

    /* renamed from: c */
    C60870cx f302104c;

    /* renamed from: e */
    private LegacyOpaStandardPage f302105e;

    /* renamed from: f */
    private C83973o f302106f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0126  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo77485e() {
        /*
            r11 = this;
            android.app.Activity r0 = r11.getActivity()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r11.f302103b
            int r0 = r0.mo96982a()
            r1 = 4
            r2 = 1
            r3 = 0
            if (r0 <= r2) goto L_0x0021
            com.google.android.apps.gsa.opaonboarding.bl r0 = r11.mo77318iT()
            r0.mo77312a()
            com.google.common.o.uf r0 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108607cg.m180627a(r1)
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r3, r3, r3)
            return
        L_0x0021:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r11.f302103b
            int r0 = r0.mo96982a()
            r4 = 2132090083(0x7f151ce3, float:1.9820496E38)
            r5 = 0
            if (r0 != r2) goto L_0x013b
            com.google.android.apps.gsa.opaonboarding.ui.a.o r0 = r11.f302106f
            r0.mo77405f()
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r0 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r0 = r0.f228723b
            android.widget.TextView r6 = r0.f228718a
            r7 = 2132092418(0x7f152602, float:1.9825232E38)
            java.lang.CharSequence r7 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r7, r0)
            android.widget.TextView$BufferType r8 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r6, r7, r8, r0)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.ar r0 = r11.f302103b
            java.util.Set r0 = r0.f301994b
            com.google.common.b.ij r0 = com.google.common.p4522b.C58528ij.m90006F(r0)
            java.lang.Object r0 = com.google.common.p4522b.C58557jl.m90133n(r0)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.i r0 = (com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108741i) r0
            com.google.common.util.concurrent.cx r6 = r11.f302104c
            java.lang.String r7 = "DeviceScanFrag"
            if (r6 != 0) goto L_0x005a
        L_0x0058:
            r6 = r3
            goto L_0x0096
        L_0x005a:
            boolean r6 = r6.isDone()
            if (r6 == 0) goto L_0x0083
            com.google.common.util.concurrent.cx r6 = r11.f302104c     // Catch:{ Exception -> 0x006f }
            com.google.android.apps.gsa.shared.s.a.a r8 = com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d.f254254a     // Catch:{ Exception -> 0x006f }
            java.lang.Object r6 = r6.get()     // Catch:{ Exception -> 0x006f }
            com.google.assistant.at.lk r6 = (com.google.assistant.p3861at.C50123lk) r6     // Catch:{ Exception -> 0x006f }
            com.google.assistant.at.li r6 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108579bk.m180528a(r0, r6)     // Catch:{ Exception -> 0x006f }
            goto L_0x0096
        L_0x006f:
            r6 = move-exception
            com.google.common.f.e r8 = f302102d
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r7)
            java.lang.String r9 = "Dps fetch unsuccessful"
            r10 = 24154(0x5e5a, float:3.3847E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r6)).mo56372aa(r10)).mo56386p(r9)
            goto L_0x0058
        L_0x0083:
            com.google.common.f.e r6 = f302102d
            com.google.common.f.x r6 = r6.mo56226d()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r6.mo56378ag(r8, r7)
            java.lang.String r8 = "DPS future not done"
            r9 = 24153(0x5e59, float:3.3846E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r9)).mo56386p(r8)
            goto L_0x0058
        L_0x0096:
            java.lang.String r8 = r0.mo97105h()
            boolean r8 = com.google.common.base.C58837ba.m90859h(r8)
            if (r8 != 0) goto L_0x00b3
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r7 = r11.f302105e
            java.lang.String r8 = r0.mo97105h()
            r8.getClass()
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r7 = r7.f228723b
            android.widget.TextView r9 = r7.f228719b
            android.widget.TextView$BufferType r10 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r9, r8, r10, r7)
            goto L_0x00c5
        L_0x00b3:
            com.google.common.f.e r8 = f302102d
            com.google.common.f.x r8 = r8.mo56226d()
            com.google.common.f.aa r9 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r9, r7)
            java.lang.String r7 = "#onCreateView: no device name in device %s"
            r9 = 24155(0x5e5b, float:3.3848E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r9)).mo56389s(r7, r0)
        L_0x00c5:
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r7 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r7 = r7.f228725d
            android.widget.Button r7 = r7.mo77361b()
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bs r8 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bs
            r8.<init>(r11)
            com.google.android.apps.gsa.shared.logger.l r9 = new com.google.android.apps.gsa.shared.logger.l
            r9.<init>(r8)
            r7.setOnClickListener(r9)
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r7 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r7 = r7.f228725d
            android.widget.Button r7 = r7.mo77360a()
            r7.setVisibility(r5)
            if (r6 == 0) goto L_0x0126
            boolean r8 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108579bk.m180529b(r6)
            if (r8 != 0) goto L_0x0126
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r8 = r11.f302105e
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r0 = r0.mo97105h()
            r9[r5] = r0
            com.google.assistant.at.lg r0 = r6.f130305d
            if (r0 != 0) goto L_0x00fe
            com.google.assistant.at.lg r0 = com.google.assistant.p3861at.C50119lg.f130295d
        L_0x00fe:
            java.lang.String r0 = r0.f130299c
            r9[r2] = r0
            r0 = 2132092419(0x7f152603, float:1.9825234E38)
            java.lang.String r0 = r11.getString(r0, r9)
            r0.getClass()
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r2 = r8.f228723b
            android.widget.TextView r5 = r2.f228719b
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r5, r0, r6, r2)
            r7.setText(r4)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bt r0 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bt
            r0.<init>(r11)
            com.google.android.apps.gsa.shared.logger.l r2 = new com.google.android.apps.gsa.shared.logger.l
            r2.<init>(r0)
            r7.setOnClickListener(r2)
            goto L_0x0133
        L_0x0126:
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bu r2 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bu
            r2.<init>(r11, r0, r6)
            com.google.android.apps.gsa.shared.logger.l r0 = new com.google.android.apps.gsa.shared.logger.l
            r0.<init>(r2)
            r7.setOnClickListener(r0)
        L_0x0133:
            com.google.common.o.uf r0 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108607cg.m180627a(r1)
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r3, r3, r3)
            return
        L_0x013b:
            com.google.android.apps.gsa.opaonboarding.ui.a.o r0 = r11.f302106f
            r0.mo77404e()
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r0 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r0 = r0.f228723b
            android.widget.TextView r1 = r0.f228718a
            r6 = 2132090086(0x7f151ce6, float:1.9820502E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r0)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r1, r6, r7, r0)
            android.os.Bundle r0 = r11.getArguments()
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            java.lang.Object r0 = com.google.common.base.C58831av.m90830c(r0, r1)
            android.os.Bundle r0 = (android.os.Bundle) r0
            java.lang.String r1 = "provider-name"
            java.lang.String r0 = r0.getString(r1)
            boolean r1 = com.google.common.base.C58837ba.m90859h(r0)
            if (r1 != 0) goto L_0x0181
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r1 = r11.f302105e
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            r0 = 2132090084(0x7f151ce4, float:1.9820498E38)
            java.lang.String r0 = r11.getString(r0, r2)
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r1 = r1.f228723b
            android.widget.TextView r2 = r1.f228719b
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r0, r6, r1)
            goto L_0x0193
        L_0x0181:
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r0 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r0 = r0.f228723b
            android.widget.TextView r1 = r0.f228719b
            r2 = 2132090085(0x7f151ce5, float:1.98205E38)
            java.lang.CharSequence r2 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r2, r0)
            android.widget.TextView$BufferType r6 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r1, r2, r6, r0)
        L_0x0193:
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r0 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r0 = r0.f228725d
            android.widget.Button r0 = r0.mo77360a()
            r0.setText(r4)
            r0.setVisibility(r5)
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bv r1 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bv
            r1.<init>(r11)
            com.google.android.apps.gsa.shared.logger.l r2 = new com.google.android.apps.gsa.shared.logger.l
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            com.google.android.apps.gsa.opaonboarding.ui.LegacyOpaStandardPage r0 = r11.f302105e
            com.google.android.apps.gsa.opaonboarding.ui.FooterLayout r0 = r0.f228725d
            android.widget.Button r0 = r0.mo77361b()
            com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bw r1 = new com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bw
            r1.<init>(r11)
            com.google.android.apps.gsa.shared.logger.l r2 = new com.google.android.apps.gsa.shared.logger.l
            r2.<init>(r1)
            r0.setOnClickListener(r2)
            r0 = 5
            com.google.common.o.uf r0 = com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108607cg.m180627a(r0)
            com.google.android.apps.gsa.shared.logger.C89949q.m146525j(r0, r3, r3, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.C108604cd.mo77485e():void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C58976aa aaVar = C58975e.f156826a;
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.device_scan, (ViewGroup) null);
        this.f302105e = legacyOpaStandardPage;
        C28295m.m52919e(legacyOpaStandardPage, new C28292j(44606));
        this.f302105e.f228725d.mo77360a().setVisibility(4);
        this.f302105e.f228725d.mo77361b().setOnClickListener(new C89943l(new C108592bx(this)));
        LegacyOpaStandardPage legacyOpaStandardPage2 = this.f302105e;
        C84031z zVar = legacyOpaStandardPage2.f228724c;
        C83973o oVar = new C83973o(zVar.f228892o, zVar.f228888k, new C108603cc());
        oVar.mo77402c();
        oVar.mo77403d();
        legacyOpaStandardPage2.mo77366a();
        this.f302106f = oVar;
        return this.f302105e;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f302106f.mo77406g();
    }
}
