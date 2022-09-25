package dagger.hilt.android.internal.p5302a;

import android.support.p031v4.app.Fragment;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C2363bk;
import dagger.hilt.C68286a;

/* renamed from: dagger.hilt.android.internal.a.a */
/* compiled from: PG */
public final class C68300a {

    /* renamed from: dagger.hilt.android.internal.a.a$a */
    /* compiled from: PG */
    public interface C68301a {
        /* renamed from: bX */
        C68303b mo60316bX();
    }

    /* renamed from: dagger.hilt.android.internal.a.a$b */
    /* compiled from: PG */
    public interface C68302b {
        /* renamed from: U */
        C68303b mo60317U();
    }

    /* renamed from: a */
    public static C2363bk m98637a(ComponentActivity componentActivity, C2363bk bkVar) {
        return ((C68301a) C68286a.m98629a(componentActivity, C68301a.class)).mo60316bX().mo60318a(componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null, bkVar);
    }

    /* renamed from: b */
    public static C2363bk m98638b(Fragment fragment, C2363bk bkVar) {
        return ((C68302b) C68286a.m98629a(fragment, C68302b.class)).mo60317U().mo60318a(fragment, fragment.getArguments(), bkVar);
    }
}
