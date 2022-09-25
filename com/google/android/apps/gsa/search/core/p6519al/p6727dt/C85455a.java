package com.google.android.apps.gsa.search.core.p6519al.p6727dt;

import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.al.dt.a */
/* compiled from: PG */
public final class C85455a {

    /* renamed from: a */
    public String f231280a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f231281b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public List f231282c = new ArrayList();

    /* renamed from: d */
    public String[] f231283d = new String[0];

    /* renamed from: a */
    public final C85458b mo78984a() {
        if (!TextUtils.isEmpty(this.f231280a)) {
            return new C85458b(this);
        }
        throw new IllegalArgumentException("MimeType cannot be empty. Must set a MimeType.");
    }
}
