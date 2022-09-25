package com.google.android.apps.gsa.nga.engine.education;

import com.evernote.android.state.BuildConfig;
import com.google.assistant.p4008y.p4009a.C53577bj;
import com.google.assistant.p4008y.p4009a.C53583bp;
import p3186j$.util.Objects;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.ar */
/* compiled from: PG */
public final /* synthetic */ class C75693ar implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Object f210122a;

    public /* synthetic */ C75693ar(Object obj) {
        this.f210122a = obj;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        Object obj2 = this.f210122a;
        C53583bp bpVar = (C53583bp) obj;
        C53577bj bjVar = C53577bj.PRIORITY_UNKNOWN;
        int i = bpVar.f140637a;
        boolean z = false;
        int i2 = i != 0 ? i != 1 ? i != 2 ? 0 : 2 : 1 : 3;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 0) {
            return Objects.equals(i == 1 ? (String) bpVar.f140638b : BuildConfig.FLAVOR, obj2);
        } else if (i3 == 1) {
            if (i == 2) {
                z = ((Boolean) bpVar.f140638b).booleanValue();
            }
            return Objects.equals(Boolean.valueOf(z), obj2);
        } else if (i3 == 2) {
            return false;
        } else {
            throw new AssertionError();
        }
    }
}
