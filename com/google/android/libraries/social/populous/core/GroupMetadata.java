package com.google.android.libraries.social.populous.core;

import android.os.Parcelable;
import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58528ij;

/* compiled from: PG */
public abstract class GroupMetadata implements Parcelable {

    /* renamed from: g */
    public int f110775g;

    /* renamed from: g */
    public static C42296bv m74353g() {
        C42247a aVar = new C42247a();
        aVar.mo45182b(false);
        aVar.mo45185e(0);
        aVar.f110834b = BuildConfig.FLAVOR;
        PeopleApiAffinity peopleApiAffinity = PeopleApiAffinity.f110783e;
        if (peopleApiAffinity != null) {
            aVar.f110835c = peopleApiAffinity;
            aVar.f110925d = 0;
            return aVar;
        }
        throw new NullPointerException("Null peopleApiAffinity");
    }

    /* renamed from: a */
    public abstract long mo44928a();

    /* renamed from: b */
    public abstract PeopleApiAffinity mo44929b();

    /* renamed from: c */
    public abstract C58833ax mo44930c();

    /* renamed from: d */
    public abstract C58528ij mo44931d();

    /* renamed from: e */
    public abstract String mo44932e();

    /* renamed from: f */
    public abstract boolean mo44934f();
}
