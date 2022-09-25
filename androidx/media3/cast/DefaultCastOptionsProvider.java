package androidx.media3.cast;

import android.content.Context;
import com.google.android.gms.cast.LaunchOptions;
import com.google.android.gms.cast.framework.C143404al;
import com.google.android.gms.cast.framework.C143430f;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.common.base.C58833ax;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
public final class DefaultCastOptionsProvider implements C143404al {
    public List getAdditionalSessionProviders(Context context) {
        return Collections.emptyList();
    }

    public CastOptions getCastOptions(Context context) {
        return C143430f.m232802a("A12D4273", new ArrayList(), true, new LaunchOptions(), (C58833ax) null, new ArrayList());
    }
}
