package com.google.android.apps.gsa.sidekick.shared.p7235e.p7236a;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.apps.gsa.shared.util.C91043j;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90887au;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.C91907e;
import com.google.android.apps.gsa.sidekick.shared.remoteapi.LoggingRequest;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7642eo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7912oo;
import com.google.p375ai.p378b.C7918ou;
import com.google.p375ai.p378b.C7947pw;
import com.google.p375ai.p378b.C8142xb;
import com.google.protobuf.MessageLite;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.e.a.i */
/* compiled from: PG */
public final class C91725i implements C91728l, C91727k {

    /* renamed from: a */
    public static final C59071e f255821a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.e.a.i");

    /* renamed from: b */
    public final Object f255822b = new Object();

    /* renamed from: c */
    public final Context f255823c;

    /* renamed from: d */
    public final C91189au f255824d;

    /* renamed from: e */
    public final C90929bz f255825e;

    /* renamed from: f */
    public final List f255826f = new ArrayList();

    /* renamed from: g */
    public final Object f255827g = new Object();

    /* renamed from: h */
    public final Set f255828h = new HashSet();

    /* renamed from: i */
    public final List f255829i = new ArrayList();

    /* renamed from: j */
    final List f255830j = new ArrayList();

    /* renamed from: k */
    public C91907e f255831k = null;

    /* renamed from: l */
    public C91723g f255832l = null;

    public C91725i(Context context, C91189au auVar, C90929bz bzVar) {
        this.f255823c = context;
        this.f255824d = auVar;
        this.f255825e = bzVar;
    }

    /* renamed from: q */
    private final void m150245q(int i, Bundle bundle) {
        synchronized (this.f255827g) {
            this.f255829i.add(new C91724h(i, bundle));
        }
    }

    /* renamed from: a */
    public final C91189au mo86214a() {
        return this.f255824d;
    }

    /* renamed from: b */
    public final C91907e mo86215b() {
        C91907e eVar;
        synchronized (this.f255822b) {
            eVar = this.f255831k;
        }
        return eVar;
    }

    /* renamed from: c */
    public final C60870cx mo86216c(String str) {
        return this.f255825e.mo85138c(new C91721e(this, str));
    }

    /* renamed from: d */
    public final void mo86217d(C91043j jVar) {
        C91907e b = mo86215b();
        if (b != null) {
            new C91720d(this.f255825e, b, jVar).mo85242e(new Void[0]);
        }
    }

    /* renamed from: e */
    public final void mo86218e() {
        C91907e b = mo86215b();
        if (b != null) {
            try {
                b.mo85976e();
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11880)).mo56386p("Error making invalidateEntries request");
            }
        }
    }

    /* renamed from: f */
    public final void mo86219f(LoggingRequest loggingRequest) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("logging-request-list", C58597ky.m90212c(loggingRequest));
        mo86224k(5, bundle);
    }

    @Deprecated
    /* renamed from: g */
    public final void mo86220g(List list) {
        synchronized (this.f255822b) {
            C91907e eVar = this.f255831k;
            if (eVar != null) {
                try {
                    eVar.mo85979h(list);
                } catch (Exception e) {
                    ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11881)).mo56386p("Error making record executed-user-actions request");
                }
            } else {
                this.f255830j.addAll(list);
            }
        }
    }

    /* renamed from: h */
    public final void mo86221h(C7718hj hjVar, C7681g gVar, C8142xb xbVar) {
        C91907e b = mo86215b();
        if (b != null) {
            try {
                b.mo85980i(new ProtoLiteParcelable((MessageLite) hjVar), gVar.f26835cv, xbVar.f28649u);
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11882)).mo56386p("Error making record feedback prompt request");
            }
        }
    }

    /* renamed from: i */
    public final void mo86222i(C7642eo eoVar) {
        Bundle bundle = new Bundle();
        bundle.putInt("request-trace", eoVar.f26533bC);
        mo86224k(2, bundle);
    }

    /* renamed from: j */
    public final void mo86223j(C7918ou ouVar, C91043j jVar) {
        new C91719c(this, this.f255825e, ouVar, jVar).mo85242e(new Void[0]);
    }

    /* renamed from: k */
    public final void mo86224k(int i, Bundle bundle) {
        C91907e b = mo86215b();
        if (b == null) {
            m150245q(i, bundle);
        } else if (i == 1) {
            try {
                b.mo85974c((ProtoLiteParcelable) bundle.getParcelable("entry"), bundle.getBoolean("record-action"));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11877)).mo56386p("Error making dismiss entry request");
            }
        } else if (i == 2) {
            try {
                b.mo85981j(bundle.getInt("request-trace"));
            } catch (Exception e2) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e2)).mo56372aa(11878)).mo56386p("Error making refreshEntries request");
            }
        } else if (i == 3) {
            int i2 = bundle.getInt("visibility");
            C8142xb a = C8142xb.m22954a(bundle.getInt("surface-type"));
            if (a == null) {
                a = C8142xb.UNKNOWN_SURFACE;
            }
            try {
                b.mo85975d(i2, a.f28649u);
            } catch (Exception e3) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e3)).mo56372aa(11879)).mo56386p("Error setting container visibility");
            }
        } else if (i != 5) {
            try {
                ((C59052c) ((C59052c) f255821a.mo56226d()).mo56372aa(11876)).mo56387q("Unknown request type: %d", i);
                int i3 = C90755l.f253831a;
            } catch (DeadObjectException unused) {
                m150245q(i, bundle);
            } catch (RemoteException e4) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e4)).mo56372aa(11883)).mo56387q("Caught exception making request type: %d", i);
            }
        } else {
            b.mo85977f(bundle.getParcelableArrayList("logging-request-list"));
        }
    }

    /* renamed from: l */
    public final void mo86225l(C7918ou ouVar, C7912oo ooVar, C7718hj hjVar) {
        C91907e b = mo86215b();
        if (b != null) {
            try {
                b.mo85984m(new ProtoLiteParcelable((MessageLite) ouVar), new ProtoLiteParcelable((MessageLite) ooVar), new ProtoLiteParcelable((MessageLite) hjVar));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11884)).mo56386p("Error making setTrainingAnswer request");
            }
        }
    }

    /* renamed from: m */
    public final void mo86226m(C7718hj hjVar) {
        C7947pw pwVar = hjVar.f26979t;
        if (pwVar == null) {
            pwVar = C7947pw.f27896j;
        }
        if (pwVar.f27906i) {
            mo86218e();
        }
        C91907e b = mo86215b();
        if (b != null) {
            try {
                b.mo85985n(new ProtoLiteParcelable((MessageLite) hjVar));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11885)).mo56386p("Error making snoozeReminder request");
            }
        }
    }

    /* renamed from: n */
    public final void mo86227n(C7718hj hjVar) {
        C91907e b = mo86215b();
        if (b != null) {
            try {
                b.mo85986o(new ProtoLiteParcelable((MessageLite) hjVar));
            } catch (Exception e) {
                ((C59052c) ((C59052c) ((C59052c) f255821a.mo56225c()).mo56382g(e)).mo56372aa(11887)).mo56386p("Error making updateBackOfCardFollowClickForEntry request");
            }
        } else {
            ((C59052c) ((C59052c) f255821a.mo56225c()).mo56372aa(11886)).mo56386p("skipping back of card Follow click, service is null");
        }
    }

    /* renamed from: o */
    public final void mo86228o(C7718hj hjVar, boolean z) {
        C60922j.m93044g(this.f255825e.mo85139d(new C90887au("dismissEntry", 1, 8, new C91717a(this, hjVar, z))), C91718b.f255808a, C60826bg.f164896a);
    }

    /* renamed from: p */
    public final C91722f mo86229p() {
        return new C91722f(this);
    }
}
