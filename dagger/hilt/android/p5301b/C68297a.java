package dagger.hilt.android.p5301b;

import android.content.Context;
import dagger.hilt.android.C68291a;
import dagger.hilt.p5299a.C68289c;
import java.util.Set;

/* renamed from: dagger.hilt.android.b.a */
/* compiled from: PG */
public final class C68297a {

    /* renamed from: dagger.hilt.android.b.a$a */
    /* compiled from: PG */
    public interface C68298a {
        /* renamed from: eE */
        Set mo60315eE();
    }

    /* renamed from: a */
    public static boolean m98634a(Context context) {
        Set eE = ((C68298a) C68291a.m98633a(context, C68298a.class)).mo60315eE();
        C68289c.m98631a(eE.size() <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (eE.isEmpty()) {
            return true;
        }
        return ((Boolean) eE.iterator().next()).booleanValue();
    }
}
