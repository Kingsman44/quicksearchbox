package org.chromium.base.p5645a;

import android.content.Context;
import org.chromium.base.C72408u;

/* renamed from: org.chromium.base.a.a */
/* compiled from: PG */
public final class C72369a {
    /* renamed from: a */
    public static Context m107033a(Context context, String str) {
        C72408u a = C72408u.m107065a();
        try {
            Context createContextForSplit = context.createContextForSplit(str);
            a.close();
            return createContextForSplit;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
