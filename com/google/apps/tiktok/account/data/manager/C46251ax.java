package com.google.apps.tiktok.account.data.manager;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.apps.tiktok.account.data.C46325t;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.C47853m;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.apps.tiktok.account.data.manager.ax */
/* compiled from: PG */
final class C46251ax extends C46277bw {

    /* renamed from: a */
    private final C46325t f121232a;

    /* renamed from: b */
    private final Executor f121233b;

    /* renamed from: c */
    private final C47853m f121234c;

    public C46251ax(C46325t tVar, Executor executor, C47853m mVar) {
        this.f121232a = tVar;
        this.f121233b = executor;
        this.f121234c = mVar;
    }

    /* renamed from: a */
    public final void mo50300a(Bundle bundle, C46282ca caVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "addAccounts");
        try {
            try {
                C60856cj.m92911t(((C46234ag) this.f121232a).f121206a.mo50272a(ProtoParsers.m95528k(bundle, "account_infos", C46215j.f121154k, C62921ba.m95368a())), C47810es.m84974n(new C46249av(caVar)), this.f121233b);
                a.close();
                return;
            } catch (Throwable th) {
                C46250aw.m82515a(th, th);
            }
            throw th;
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54706)).mo56386p("Invalid AccountInfos");
            try {
                caVar.mo50306a(C46257bc.m82525a(e));
            } catch (RemoteException e2) {
                ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e2)).mo56372aa(54707)).mo56386p("Exception in client failure callback");
            }
            a.close();
        }
    }

    /* renamed from: b */
    public final void mo50301b(int i, C46285cd cdVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "disable");
        try {
            C60856cj.m92911t(this.f121232a.mo50281a(AccountId.m82057b(i)), C47810es.m84974n(new C46252ay(cdVar)), this.f121233b);
            a.close();
            return;
        } catch (Throwable th) {
            C46250aw.m82515a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo50302c(int i, C46285cd cdVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "enable");
        try {
            C60856cj.m92911t(this.f121232a.mo50282b(AccountId.m82057b(i)), C47810es.m84974n(new C46252ay(cdVar)), this.f121233b);
            a.close();
            return;
        } catch (Throwable th) {
            C46250aw.m82515a(th, th);
        }
        throw th;
    }

    /* renamed from: d */
    public final void mo50303d(int[] iArr, C46285cd cdVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "removeAccounts");
        try {
            C58480gp e = C58485gu.m89837e();
            for (int b : iArr) {
                e.mo55395g(AccountId.m82057b(b));
            }
            C60856cj.m92911t(((C46234ag) this.f121232a).f121206a.mo50275d(e.mo55394f()), C47810es.m84974n(new C46252ay(cdVar)), this.f121233b);
            a.close();
            return;
        } catch (Throwable th) {
            C46250aw.m82515a(th, th);
        }
        throw th;
    }

    /* renamed from: e */
    public final void mo50304e(Bundle bundle, C46285cd cdVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "sync");
        try {
            try {
                C60856cj.m92911t(this.f121232a.mo50291k(ProtoParsers.m95528k(bundle, "account_infos", C46215j.f121154k, C62921ba.m95368a())), C47810es.m84974n(new C46252ay(cdVar)), this.f121233b);
                a.close();
                return;
            } catch (Throwable th) {
                C46250aw.m82515a(th, th);
            }
            throw th;
        } catch (C62974ct e) {
            ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e)).mo56372aa(54708)).mo56386p("Invalid AccountInfos");
            try {
                cdVar.mo50308a(C46257bc.m82525a(e));
            } catch (RemoteException e2) {
                ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e2)).mo56372aa(54709)).mo56386p("Exception in client failure callback");
            }
            a.close();
        }
    }

    /* renamed from: f */
    public final void mo50305f(Bundle bundle, C46285cd cdVar) {
        C47573bx a = this.f121234c.mo51699a("AccountSyncServiceBinder", "syncForTypes");
        try {
            List k = ProtoParsers.m95528k(bundle, "account_infos", C46215j.f121154k, C62921ba.m95368a());
            ArrayList<String> stringArrayList = bundle.getStringArrayList("account_types");
            stringArrayList.getClass();
            C60856cj.m92911t(this.f121232a.mo50292l(k, C58528ij.m90006F(stringArrayList)), C47810es.m84974n(new C46252ay(cdVar)), this.f121233b);
            a.close();
            return;
        } catch (Exception e) {
            try {
                cdVar.mo50308a(C46257bc.m82525a(e));
            } catch (RemoteException e2) {
                try {
                    C46250aw.m82515a(e2, e);
                    ((C59052c) ((C59052c) ((C59052c) C46257bc.f121238a.mo56225c()).mo56382g(e2)).mo56372aa(54710)).mo56386p("Exception in client failure callback");
                } catch (Throwable th) {
                    C46250aw.m82515a(th, th);
                }
            }
            a.close();
            return;
        }
        throw th;
    }
}
