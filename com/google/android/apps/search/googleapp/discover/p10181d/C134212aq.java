package com.google.android.apps.search.googleapp.discover.p10181d;

import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;

/* renamed from: com.google.android.apps.search.googleapp.discover.d.aq */
/* compiled from: PG */
public final class C134212aq {

    /* renamed from: a */
    public static final C59071e f365583a = C59071e.m91332i("com.google.android.apps.search.googleapp.discover.d.aq");

    /* renamed from: b */
    public final C89859i f365584b;

    /* renamed from: c */
    public final C60888db f365585c;

    /* renamed from: d */
    public final Object f365586d = new Object();

    /* renamed from: e */
    public C134206ak f365587e;

    /* renamed from: f */
    public boolean f365588f;

    /* renamed from: g */
    public boolean f365589g;

    /* renamed from: h */
    public final C39143kr f365590h;

    public C134212aq(C89859i iVar, C60888db dbVar, C39143kr krVar) {
        this.f365584b = iVar;
        this.f365585c = dbVar;
        this.f365590h = krVar;
    }

    /* renamed from: g */
    public static boolean m217771g(int i) {
        return i == 2;
    }

    /* renamed from: a */
    public final void mo111640a() {
        C134206ak akVar = this.f365587e;
        if (akVar != null) {
            akVar.mo111623b();
            this.f365587e = null;
        }
    }

    /* renamed from: b */
    public final void mo111641b() {
        C134206ak akVar = this.f365587e;
        if (akVar instanceof C134208am) {
            ((C59052c) ((C59052c) f365583a.mo56226d()).mo56372aa(40274)).mo56386p("Attempted to start while in a feed launch app flow");
        } else if (akVar instanceof C134211ap) {
            ((C59052c) ((C59052c) f365583a.mo56226d()).mo56372aa(40273)).mo56386p("Attempted to start while in an interactive refresh app flow");
        } else if (akVar instanceof C134210ao) {
            ((C59052c) ((C59052c) f365583a.mo56226d()).mo56372aa(40272)).mo56386p("Attempted to start while in a notification launch app flow");
        }
    }

    /* renamed from: c */
    public final void mo111642c(C89885b bVar) {
        synchronized (this.f365586d) {
            C134206ak akVar = this.f365587e;
            if (akVar != null) {
                akVar.mo111633l(bVar);
            }
        }
    }

    /* renamed from: d */
    public final void mo111643d(C89885b bVar) {
        C89885b bVar2 = C89885b.UNKNOWN;
        int ordinal = bVar.ordinal();
        boolean z = true;
        if (ordinal != 703) {
            if (!(ordinal == 704 || ordinal == 706)) {
                switch (ordinal) {
                    case 697:
                    case 701:
                        break;
                    case 698:
                    case 699:
                    case 700:
                        break;
                    default:
                        switch (ordinal) {
                            case 713:
                            case 714:
                            case 715:
                            case 716:
                            case 717:
                            case 718:
                                break;
                            default:
                                ((C59052c) ((C59052c) f365583a.mo56226d()).mo56372aa(40298)).mo56387q("Invalid GsaErrorCode %s, using FEED_LAUNCH", bVar.f246280a);
                                bVar = C89885b.FEED_LAUNCH;
                                break;
                        }
                }
            }
            z = false;
        }
        synchronized (this.f365586d) {
            C134206ak akVar = this.f365587e;
            if (akVar != null) {
                if (z) {
                    akVar.mo111627f(C134214c.m217785a(bVar));
                } else {
                    akVar.mo111626e(C134214c.m217785a(bVar));
                }
                mo111640a();
            }
        }
    }

    /* renamed from: e */
    public final void mo111644e(C134206ak akVar) {
        mo111640a();
        this.f365587e = akVar;
        akVar.mo111634m();
    }

    /* renamed from: f */
    public final void mo111645f(int i) {
        synchronized (this.f365586d) {
            if (i == 103) {
                this.f365588f = true;
                i = 103;
            }
            C134206ak akVar = this.f365587e;
            if (akVar != null) {
                akVar.mo111637p(i);
                mo111640a();
            }
        }
    }
}
