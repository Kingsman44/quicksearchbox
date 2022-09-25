package com.google.android.libraries.lens.view.session.ondevice.p2169d;

import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.session.ondevice.offlinedownload.C27981d;
import com.google.android.libraries.lens.view.utils.C28136y;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Locale;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.d.m */
/* compiled from: PG */
public final class C27957m implements C27965u {

    /* renamed from: a */
    private final C27981d f76118a;

    static {
        C58974d.m91135i("NoopTranslationProviderImpl");
    }

    public C27957m(C27981d dVar) {
        this.f76118a = dVar;
    }

    /* renamed from: a */
    public final C60870cx mo33423a(String str, String str2, C27966v vVar) {
        return C60856cj.m92899h(new UnsupportedOperationException("Translation can not be executed outside of LODE."));
    }

    /* renamed from: b */
    public final void mo33424b(String str, String str2) {
    }

    /* renamed from: c */
    public final void mo33425c() {
    }

    /* renamed from: d */
    public final void mo33426d() {
    }

    /* renamed from: e */
    public final boolean mo33427e(String... strArr) {
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            if (!C58837ba.m90859h(str)) {
                C25327c i2 = this.f76118a.mo33436i(C28136y.m52434e(Locale.forLanguageTag(str)));
                if (Objects.equals(i2, C25327c.DOWNLOADED) || Objects.equals(i2, C25327c.PERMANENT)) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo33428f() {
        return false;
    }
}
