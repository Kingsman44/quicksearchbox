package com.google.android.libraries.onegoogle.owners.mdi;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.C143842n;
import com.google.android.libraries.mdi.p2213d.p2219c.C28682k;
import com.google.android.libraries.mdi.p2213d.p2219c.p2227d.C28675a;
import com.google.android.libraries.onegoogle.common.C30926m;
import com.google.android.libraries.onegoogle.owners.C30941a;
import com.google.android.libraries.onegoogle.owners.C30969d;
import com.google.android.libraries.onegoogle.owners.C30974i;
import com.google.android.libraries.onegoogle.owners.mdi.MdiNotAvailableException;
import com.google.android.libraries.onegoogle.p2380c.p2381a.C30847m;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45626af;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45632al;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45637aq;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45642av;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45650bc;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45666l;
import com.google.apps.p3584c.p3585a.p3586a.p3587a.p3588a.C45668n;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60860cn;
import com.google.common.util.concurrent.C60861co;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60916ec;
import com.google.common.util.concurrent.C60922j;
import com.google.p4017at.p4078i.p4079a.C54290d;
import com.google.p4017at.p4078i.p4079a.C54292f;
import com.google.protobuf.C62963cj;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
final class MdiOwnersLoader {

    /* renamed from: a */
    public final C28682k f83458a;

    /* renamed from: b */
    public final C30969d f83459b;

    /* renamed from: c */
    private final C30847m f83460c;

    /* renamed from: d */
    private final String f83461d;

    /* compiled from: PG */
    public class MdiException extends Exception {
        public MdiException(String str) {
            super(str);
        }
    }

    public MdiOwnersLoader(Context context, C28682k kVar, C30969d dVar, C30847m mVar) {
        this.f83458a = kVar;
        this.f83459b = dVar;
        this.f83460c = mVar;
        this.f83461d = context.getPackageName();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo36672a(C58817ah ahVar) {
        C60870cx a = this.f83459b.mo36668a();
        C31005t tVar = new C31005t(this, ahVar);
        return C60922j.m93045h(a, C47810es.m84966f(tVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo36673b(C30974i iVar, C60870cx cxVar) {
        String str;
        C58838bb.m90883r(cxVar.isDone());
        str = "OK";
        Class<MdiException> cls = MdiException.class;
        try {
            int i = C60861co.f164952a;
            C54290d dVar = (C54290d) C60861co.m92916b(C60860cn.f164951a, cxVar, cls);
            if (dVar == null) {
                str = "Absent";
                iVar.mo36625i(false);
            } else if (dVar.f142640a.size() <= 0) {
                Log.e("OneGoogle", "GetPeopleResponse contains no persons");
                this.f83460c.mo36541b("NoPerson", this.f83461d);
            } else {
                C45632al alVar = ((C54292f) dVar.f142640a.get(0)).f142644a;
                if (alVar == null) {
                    alVar = C45632al.f120021r;
                }
                if (alVar.f120025c.size() > 0) {
                    C45650bc bcVar = (C45650bc) alVar.f120025c.get(0);
                    ((C30941a) iVar).f83369d = bcVar.f120096a;
                    iVar.mo36624h(new C62963cj(bcVar.f120097b, C45650bc.f120093c).contains(C45637aq.GOOGLE_ONE_USER));
                    ((C30941a) iVar).f83373h = true != new C62963cj(bcVar.f120097b, C45650bc.f120093c).contains(C45637aq.GOOGLE_FAMILY_CHILD_USER) ? 3 : 2;
                    iVar.mo36623g(new C62963cj(bcVar.f120097b, C45650bc.f120093c).contains(C45637aq.GOOGLE_APPS_USER));
                }
                if (alVar.f120026d.size() > 0) {
                    C45626af afVar = (C45626af) alVar.f120026d.get(0);
                    int i2 = afVar.f120004a;
                    String str2 = null;
                    ((C30941a) iVar).f83366a = (i2 & 2) != 0 ? afVar.f120006c : null;
                    ((C30941a) iVar).f83367b = (i2 & 64) != 0 ? afVar.f120007d : null;
                    if ((i2 & 128) != 0) {
                        str2 = afVar.f120008e;
                    }
                    ((C30941a) iVar).f83368c = str2;
                }
                C45642av a = C28675a.m53558a(dVar);
                if (a != null) {
                    if (a.f120078d) {
                        ((C30941a) iVar).f83371f = a.f120077c;
                    } else {
                        ((C30941a) iVar).f83370e = a.f120077c;
                    }
                }
                if (alVar.f120030h.size() == 1) {
                    int a2 = C45666l.m81356a(((C45668n) alVar.f120030h.get(0)).f120136a);
                    if (a2 != 0) {
                        if (a2 != 1) {
                            if (a2 == 2) {
                                ((C30941a) iVar).f83372g = 2;
                            } else if (a2 != 4) {
                                ((C30941a) iVar).f83372g = 4;
                            } else {
                                ((C30941a) iVar).f83372g = 3;
                            }
                        }
                    }
                    ((C30941a) iVar).f83372g = 1;
                }
                this.f83460c.mo36541b(str, this.f83461d);
            }
        } catch (MdiException | C60916ec e) {
            Throwable cause = e.getCause();
            String a3 = C30926m.m57721a(cause);
            C143842n nVar = (C143842n) C30926m.m57722b(cause, C143842n.class);
            if (nVar != null) {
                int i3 = nVar.f389919a.f389621g;
                a3 = "ApiException-" + i3;
                if (i3 == 17) {
                    throw new ExecutionException(new MdiNotAvailableException.ApiNotConnectedException(cause));
                } else if (i3 == 10) {
                    throw new ExecutionException(new MdiNotAvailableException.DeveloperErrorException(cause));
                }
            }
            Log.e("OneGoogle", "Failed to load profile data", e);
        } finally {
            this.f83460c.mo36541b(str, this.f83461d);
        }
    }
}
