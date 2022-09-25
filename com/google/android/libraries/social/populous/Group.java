package com.google.android.libraries.social.populous;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.social.populous.core.GroupMetadata;
import com.google.android.libraries.social.populous.core.GroupOrigin;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.common.p4522b.C58485gu;

/* compiled from: PG */
public abstract class Group implements Loggable {
    /* renamed from: a */
    public abstract GroupMetadata mo44780a();

    /* renamed from: b */
    public abstract C58485gu mo44781b();

    /* renamed from: c */
    public abstract C58485gu mo44782c();

    /* renamed from: d */
    public abstract String mo44783d();

    /* renamed from: e */
    public abstract String mo44784e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final String mo44829f() {
        C58485gu c = mo44782c();
        int size = c.size();
        int i = 0;
        while (i < size) {
            GroupOrigin groupOrigin = (GroupOrigin) c.get(i);
            i++;
            if (groupOrigin.mo45006a() != null) {
                return groupOrigin.mo45006a().f110777a.toString();
            }
        }
        return BuildConfig.FLAVOR;
    }
}
