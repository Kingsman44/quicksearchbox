package com.google.android.apps.gsa.staticplugins.opa.tapas.p8475b.p8482g;

import android.support.p031v4.media.session.C0320v;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80003cx;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80004cy;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80005cz;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8582f.C113417a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.b.g.v */
/* compiled from: PG */
public final /* synthetic */ class C111157v implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C111136ae f309432a;

    /* renamed from: b */
    public final /* synthetic */ C80005cz f309433b;

    public /* synthetic */ C111157v(C111136ae aeVar, C80005cz czVar) {
        this.f309432a = aeVar;
        this.f309433b = czVar;
    }

    public final void run() {
        C111136ae aeVar = this.f309432a;
        C80005cz czVar = this.f309433b;
        C80003cx cxVar = (C80003cx) C80004cy.f219489x.createBuilder();
        for (C0320v vVar : ((C113417a) aeVar.f309394c.mo27525b()).mo100228b()) {
            if (!(vVar == null || vVar.mo1038f() == null || vVar.mo1036d() == null)) {
                switch (vVar.mo1038f().f994a) {
                    case 1:
                        float f = ((C80004cy) cxVar.instance).f219503m;
                        cxVar.copyOnWrite();
                        C80004cy cyVar = (C80004cy) cxVar.instance;
                        cyVar.f219491a |= 2048;
                        cyVar.f219503m = f + 1.0f;
                        break;
                    case 2:
                        float f2 = ((C80004cy) cxVar.instance).f219504n;
                        cxVar.copyOnWrite();
                        C80004cy cyVar2 = (C80004cy) cxVar.instance;
                        cyVar2.f219491a |= 4096;
                        cyVar2.f219504n = f2 + 1.0f;
                        break;
                    case 3:
                        float f3 = ((C80004cy) cxVar.instance).f219505o;
                        cxVar.copyOnWrite();
                        C80004cy cyVar3 = (C80004cy) cxVar.instance;
                        cyVar3.f219491a |= 8192;
                        cyVar3.f219505o = f3 + 1.0f;
                        break;
                    case 4:
                        float f4 = ((C80004cy) cxVar.instance).f219506p;
                        cxVar.copyOnWrite();
                        C80004cy cyVar4 = (C80004cy) cxVar.instance;
                        cyVar4.f219491a |= 16384;
                        cyVar4.f219506p = f4 + 1.0f;
                        break;
                    case 5:
                        float f5 = ((C80004cy) cxVar.instance).f219507q;
                        cxVar.copyOnWrite();
                        C80004cy cyVar5 = (C80004cy) cxVar.instance;
                        cyVar5.f219491a |= 32768;
                        cyVar5.f219507q = f5 + 1.0f;
                        break;
                    case 6:
                        float f6 = ((C80004cy) cxVar.instance).f219508r;
                        cxVar.copyOnWrite();
                        C80004cy cyVar6 = (C80004cy) cxVar.instance;
                        cyVar6.f219491a |= 65536;
                        cyVar6.f219508r = f6 + 1.0f;
                        break;
                    case 7:
                        float f7 = ((C80004cy) cxVar.instance).f219509s;
                        cxVar.copyOnWrite();
                        C80004cy cyVar7 = (C80004cy) cxVar.instance;
                        cyVar7.f219491a |= C89885b.S3REQUEST_VALUE;
                        cyVar7.f219509s = f7 + 1.0f;
                        break;
                    case 8:
                        float f8 = ((C80004cy) cxVar.instance).f219510t;
                        cxVar.copyOnWrite();
                        C80004cy cyVar8 = (C80004cy) cxVar.instance;
                        cyVar8.f219491a |= C89885b.HTTP_VALUE;
                        cyVar8.f219510t = f8 + 1.0f;
                        break;
                    case 9:
                        float f9 = ((C80004cy) cxVar.instance).f219511u;
                        cxVar.copyOnWrite();
                        C80004cy cyVar9 = (C80004cy) cxVar.instance;
                        cyVar9.f219491a |= 524288;
                        cyVar9.f219511u = f9 + 1.0f;
                        break;
                    case 10:
                        float f10 = ((C80004cy) cxVar.instance).f219512v;
                        cxVar.copyOnWrite();
                        C80004cy cyVar10 = (C80004cy) cxVar.instance;
                        cyVar10.f219491a |= 1048576;
                        cyVar10.f219512v = f10 + 1.0f;
                        break;
                    case 11:
                        float f11 = ((C80004cy) cxVar.instance).f219513w;
                        cxVar.copyOnWrite();
                        C80004cy cyVar11 = (C80004cy) cxVar.instance;
                        cyVar11.f219491a |= C89885b.NOW_VALUE;
                        cyVar11.f219513w = f11 + 1.0f;
                        break;
                }
            }
        }
        czVar.copyOnWrite();
        C80007da daVar = (C80007da) czVar.instance;
        C80004cy cyVar12 = (C80004cy) cxVar.build();
        C80007da daVar2 = C80007da.f219520C;
        cyVar12.getClass();
        daVar.f219533j = cyVar12;
        daVar.f219524a |= 4096;
    }
}
