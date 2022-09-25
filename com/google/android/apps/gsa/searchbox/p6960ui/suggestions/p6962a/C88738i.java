package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.p4017at.p4060h.p4073d.p4074a.C54216ae;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54260x;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.i */
/* compiled from: PG */
public final class C88738i extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f240053a;

    public C88738i(Context context) {
        this.f240053a = context;
    }

    /* renamed from: n */
    private static String m143822n(C54228aq aqVar) {
        if (aqVar == null || (aqVar.f142330a & 4) == 0) {
            return null;
        }
        C54216ae aeVar = aqVar.f142334f;
        if (aeVar == null) {
            aeVar = C54216ae.f142285C;
        }
        return aeVar.f142295f;
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 136;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return TextUtils.isEmpty(m143822n(C88727aj.m143706o(suggestion))) ? 57 : 58;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240053a.getResources().getString(R.string.on_device_app_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        String str;
        String str2;
        C54228aq o = C88727aj.m143706o(suggestion);
        Spanned spanned = null;
        if ((o.f142330a & 1048576) != 0) {
            C54260x xVar = o.f142347s;
            if (xVar == null) {
                xVar = C54260x.f142466e;
            }
            str2 = xVar.f142471d;
            C54260x xVar2 = o.f142347s;
            if (xVar2 == null) {
                xVar2 = C54260x.f142466e;
            }
            str = xVar2.f142470c;
        } else {
            str2 = null;
            str = null;
        }
        byte[] decode = Base64.decode(str2, 0);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f240053a.getResources(), BitmapFactory.decodeByteArray(decode, 0, decode.length));
        if (!TextUtils.isEmpty(str)) {
            spanned = this.f240010p.mo44238e(str);
        }
        String n = m143822n(o);
        if (!TextUtils.isEmpty(n)) {
            anVar.mo82587v(this.f240010p.mo44238e(n));
            if (spanned != null) {
                anVar.mo82588w(spanned);
            }
        } else if (spanned != null) {
            anVar.mo82587v(spanned);
        }
        anVar.mo82349c(0).mo82563f(bitmapDrawable, -1);
        anVar.mo82349c(1).mo82560c();
        return true;
    }
}
