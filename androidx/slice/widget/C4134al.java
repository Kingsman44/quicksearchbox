package androidx.slice.widget;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.LiveData;
import androidx.p060c.C0979i;
import androidx.slice.C4111j;
import androidx.slice.SliceSpec;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* renamed from: androidx.slice.widget.al */
/* compiled from: PG */
public final class C4134al {

    /* renamed from: a */
    public static final SliceSpec f13279a;

    /* renamed from: b */
    public static final SliceSpec f13280b;

    /* renamed from: c */
    public static final Set f13281c;

    static {
        SliceSpec sliceSpec = new SliceSpec("androidx.app.slice.BASIC", 1);
        f13279a = sliceSpec;
        SliceSpec sliceSpec2 = new SliceSpec("androidx.app.slice.LIST", 1);
        f13280b = sliceSpec2;
        f13281c = new C0979i((Collection) Arrays.asList(new SliceSpec[]{C4111j.f13145a, C4111j.f13146b, C4111j.f13147c, sliceSpec, sliceSpec2}));
    }

    /* renamed from: a */
    public static LiveData m11866a(Context context, Uri uri) {
        return new C4133ak(context.getApplicationContext(), uri);
    }
}
