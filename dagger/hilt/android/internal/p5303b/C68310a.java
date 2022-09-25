package dagger.hilt.android.internal.p5303b;

import android.app.Activity;
import android.support.p031v4.app.C0167am;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: dagger.hilt.android.internal.b.a */
/* compiled from: PG */
public final class C68310a {
    /* renamed from: a */
    public static C0167am m98648a(Activity activity) {
        try {
            return (C0167am) activity;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }

    /* renamed from: b */
    public static C58833ax m98649b(Activity activity) {
        if (activity != null) {
            return C58833ax.m90834k((C0167am) activity);
        }
        try {
            return C58836b.f156633a;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity))), e);
        }
    }
}
