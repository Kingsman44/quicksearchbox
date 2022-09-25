package com.google.android.apps.gsa.search.shared.actions;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.actions.util.C87489k;
import com.google.android.apps.gsa.search.shared.actions.util.MatchingProviderInfo;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89023au;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.p7128a.C90454b;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.speech.p7139a.C90509a;
import com.google.android.apps.gsa.shared.speech.p7139a.C90513e;
import com.google.android.apps.gsa.shared.speech.p7139a.C90523o;
import com.google.android.apps.gsa.shared.speech.p7139a.C90524p;
import com.google.android.apps.gsa.shared.speech.p7139a.C90527s;
import com.google.android.apps.gsa.shared.speech.p7139a.C90528t;
import com.google.android.apps.gsa.shared.speech.p7139a.C90529u;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* compiled from: PG */
public class SearchError extends VisitableAbstractVoiceAction implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C87475r();

    /* renamed from: f */
    public final C90456c f236022f;

    /* renamed from: g */
    public final Query f236023g;

    /* renamed from: h */
    public final int f236024h;

    /* renamed from: i */
    public final int f236025i;

    /* renamed from: j */
    public final C58833ax f236026j;

    /* renamed from: k */
    public final String f236027k;

    /* renamed from: l */
    public final String f236028l;

    /* renamed from: m */
    protected long f236029m;

    protected SearchError(Parcel parcel) {
        super(parcel);
        this.f236023g = (Query) parcel.readParcelable(getClass().getClassLoader());
        this.f236027k = null;
        this.f236022f = new C90452a(parcel.readInt(), parcel.readInt());
        this.f236029m = parcel.readLong();
        this.f236024h = parcel.readInt();
        this.f236025i = parcel.readInt();
        this.f236028l = parcel.readString();
        int readInt = parcel.readInt();
        this.f236026j = readInt != 0 ? C58833ax.m90834k(Integer.valueOf(readInt)) : C58836b.f156633a;
    }

    /* renamed from: Q */
    static boolean m141470Q(C90456c cVar, int i) {
        for (Throwable c = cVar.mo79845c(); c != null; c = c.getCause()) {
            if ((c instanceof C90456c) && ((C90456c) c).mo79843a() == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    public final Object mo81132L(C87501w wVar) {
        return wVar.mo81496c(this);
    }

    /* renamed from: M */
    public final boolean mo81133M() {
        return mo81138R(8);
    }

    /* renamed from: N */
    public final int mo81135N() {
        return this.f236022f.mo79843a();
    }

    /* renamed from: O */
    public final int mo81136O() {
        return this.f236022f.mo79844b();
    }

    /* renamed from: P */
    public final String mo81137P() {
        return C90454b.m147153c(mo81136O(), mo81135N());
    }

    /* renamed from: R */
    public final boolean mo81138R(long j) {
        return (this.f236029m & j) == j;
    }

    /* renamed from: S */
    public int mo81139S() {
        return 0;
    }

    /* renamed from: f */
    public final MatchingProviderInfo mo81065f() {
        return C87489k.m142013a();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        String simpleName = getClass().getSimpleName();
        String P = mo81137P();
        fVar.mo85291r(simpleName + ": " + P);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f236023g, i);
        parcel.writeInt(mo81136O());
        parcel.writeInt(mo81135N());
        parcel.writeLong(this.f236029m);
        parcel.writeInt(this.f236024h);
        parcel.writeInt(this.f236025i);
        parcel.writeString(this.f236028l);
        parcel.writeInt(((Integer) this.f236026j.mo56109e(0)).intValue());
    }

    public SearchError(Query query, String str, C90456c cVar) {
        C58833ax axVar;
        int i;
        query.getClass();
        this.f236023g = query;
        cVar.getClass();
        this.f236022f = cVar;
        this.f236027k = str;
        int b = cVar.mo79844b();
        int a = cVar.mo79843a();
        long j = 544;
        if (cVar.mo79846d() && cVar.mo79844b() != 216) {
            j = 545;
        }
        if (cVar instanceof C90528t) {
            C90528t tVar = (C90528t) cVar;
            boolean z = tVar instanceof C90509a;
            int i2 = 4;
            if (z) {
                i = 3;
            } else {
                i = 2;
                if (!(tVar instanceof C90523o)) {
                    if (tVar instanceof C90527s) {
                        i = 7;
                    } else if (tVar instanceof C90529u) {
                        i = 6;
                    } else if (!(tVar instanceof C90524p)) {
                        i = 4;
                    }
                }
            }
            this.f236024h = i;
            if (z) {
                i2 = 5;
            } else if (!(tVar instanceof C90523o) && !(tVar instanceof C90524p) && !(tVar instanceof C90513e)) {
                i2 = tVar instanceof C90527s ? 1 : 3;
            }
            this.f236025i = i2;
            if ((tVar instanceof C90527s) || (tVar instanceof C90529u)) {
                j |= 64;
            }
        } else {
            this.f236024h = 0;
            this.f236025i = 0;
        }
        if (a == 262170) {
            this.f236028l = ((C89023au) cVar.mo79845c().getCause()).f241283b;
        } else {
            this.f236028l = null;
        }
        Throwable c = cVar.mo79845c();
        while (true) {
            if (c == null) {
                axVar = C58836b.f156633a;
                break;
            }
            if (c instanceof C90456c) {
                C90456c cVar2 = (C90456c) c;
                int a2 = cVar2.mo79843a();
                if (C90454b.m147151a(a2, cVar2.mo79844b()) == 3) {
                    axVar = C58833ax.m90834k(Integer.valueOf(a2));
                    break;
                }
            }
            c = c.getCause();
        }
        this.f236026j = axVar;
        j = cVar instanceof C90527s ? j | 2 : j;
        j = a == 393244 ? j | 4 : j;
        int a3 = C90454b.m147151a(a, b);
        j = (a3 == 3 || a == 524289) ? j | 16 : j;
        j = a3 == 9 ? j | 256 : j;
        j = a3 == 7 ? j | 1024 : j;
        j = a == 458754 ? j | 8 : j;
        this.f236029m = (m141470Q(cVar, C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_WIFI_VALUE) || m141470Q(cVar, C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_CELL_VALUE) || m141470Q(cVar, C89885b.HTTP_CAPTIVE_PORTAL_DETECTED_OTHER_VALUE)) ? (m141470Q(cVar, C89885b.CRONET_NET_ERROR_CERT_DATE_INVALID_VALUE) ? j | 16384 : j) | 2048 : j;
    }
}
