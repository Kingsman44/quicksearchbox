package com.google.android.libraries.social.populous.p3296e.p3303g;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.C42320cs;
import com.google.android.libraries.social.populous.storage.C42674cu;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4181bi.C55796af;
import com.google.p4181bi.C55797ag;
import com.google.p4181bi.C55814ax;
import com.google.p4181bi.C55815ay;
import com.google.p4181bi.C55844f;
import com.google.p4181bi.C55845g;
import com.google.p4181bi.C55847i;
import com.google.p4181bi.C55856r;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.social.populous.e.g.n */
/* compiled from: PG */
public final /* synthetic */ class C42541n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42542o f111574a;

    /* renamed from: b */
    public final /* synthetic */ C55844f f111575b;

    public /* synthetic */ C42541n(C42542o oVar, C55844f fVar) {
        this.f111574a = oVar;
        this.f111575b = fVar;
    }

    public final void run() {
        C42542o oVar = this.f111574a;
        C55844f fVar = this.f111575b;
        C58480gp e = C58485gu.m89837e();
        for (C55847i iVar : fVar.f147354a) {
            int i = 1;
            if (iVar.f147360a == 1) {
                C55815ay ayVar = (C55815ay) iVar.f147361b;
                for (C55856r rVar : ayVar.f147279c) {
                    if (rVar.f147383b == 4) {
                        C55797ag agVar = (C55797ag) rVar.f147384c;
                        long b = oVar.f111576a.mo26870b();
                        C55845g gVar = (C55845g) C55847i.f147358c.createBuilder();
                        C55814ax axVar = (C55814ax) C55815ay.f147275f.createBuilder(ayVar);
                        axVar.copyOnWrite();
                        ((C55815ay) axVar.instance).f147279c = C55815ay.emptyProtobufList();
                        axVar.mo54279b(rVar);
                        gVar.copyOnWrite();
                        C55847i iVar2 = (C55847i) gVar.instance;
                        C55815ay ayVar2 = (C55815ay) axVar.build();
                        ayVar2.getClass();
                        iVar2.f147361b = ayVar2;
                        iVar2.f147360a = i;
                        C63088z byteString = ((C55847i) gVar.build()).toByteString();
                        int a = C55796af.m87735a(agVar.f147235b);
                        int i2 = a - 1;
                        if (a != 0) {
                            if (i2 == 0) {
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_EMAIL.name(), agVar.f147235b == 2 ? (String) agVar.f147236c : BuildConfig.FLAVOR, b, byteString));
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_TARGET.name(), agVar.f147235b == 2 ? (String) agVar.f147236c : BuildConfig.FLAVOR, b, byteString));
                            } else if (i2 == i) {
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_PHONE.name(), agVar.f147235b == 3 ? (String) agVar.f147236c : BuildConfig.FLAVOR, b, byteString));
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_TARGET.name(), agVar.f147235b == 3 ? (String) agVar.f147236c : BuildConfig.FLAVOR, b, byteString));
                            } else if (i2 == 2 && (agVar.f147234a & i) != 0) {
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_GAIA.name(), agVar.f147237d, b, byteString));
                            }
                            if ((agVar.f147234a & 1) != 0) {
                                e.mo55395g(new C42674cu(C42320cs.IN_APP_TARGET.name(), agVar.f147237d, b, byteString));
                            }
                            i = 1;
                        } else {
                            throw null;
                        }
                    }
                }
                continue;
            }
        }
        C58485gu f = e.mo55394f();
        if (!f.isEmpty()) {
            oVar.f111577b.mo45701m().mo45765e(f);
        }
    }
}
