package com.google.android.apps.gsa.staticplugins.p7388al;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.TextUtils;
import androidx.core.content.C1877c;
import androidx.core.content.C1878d;
import androidx.core.graphics.drawable.C1929b;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LinkUtil;
import com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip.p6466a.C83992d;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C59052c;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.al.n */
/* compiled from: PG */
final class C93940n implements C83992d {

    /* renamed from: a */
    final /* synthetic */ C93943q f262318a;

    /* renamed from: b */
    private final String f262319b;

    /* renamed from: c */
    private final String f262320c;

    /* renamed from: d */
    private final int f262321d;

    public C93940n(C93943q qVar, String str, int i, String str2) {
        this.f262318a = qVar;
        this.f262319b = str;
        this.f262321d = i;
        this.f262320c = str2;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo77436a() {
        return 1;
    }

    /* renamed from: b */
    public final /* synthetic */ int mo77437b() {
        return 0;
    }

    /* renamed from: c */
    public final Drawable mo77438c() {
        Drawable a = C1877c.m5125a(this.f262318a.getActivity(), R.drawable.quantum_ic_error_outline_vd_theme_24);
        C1929b.m5225f(a, C1878d.m5128a(this.f262318a.getActivity(), 17170443));
        return a;
    }

    /* renamed from: d */
    public final CharSequence mo77439d() {
        return this.f262319b;
    }

    /* renamed from: e */
    public final CharSequence mo77440e() {
        C93943q qVar = this.f262318a;
        int i = this.f262321d;
        String g = C58837ba.m90858g(this.f262320c);
        int i2 = i - 1;
        if (i2 == 0) {
            return qVar.getString(R.string.assistant_speaker_id_enrollment_device_not_supported_toast);
        }
        if (i2 != 1) {
            Object[] objArr = new Object[1];
            try {
                String e = C92654a.m152608e(((C92541i) qVar.f262342n.mo27525b()).mo87316a(), g);
                if (TextUtils.isEmpty(e)) {
                    ((C59052c) ((C59052c) C93943q.f262327b.mo56226d()).mo56372aa(19337)).mo56389s("Could not convert locale [%s] to a spoken language.", g);
                } else {
                    g = e;
                }
            } catch (Exception unused) {
                ((C59052c) ((C59052c) C93943q.f262327b.mo56226d()).mo56372aa(19338)).mo56389s("Could not convert locale [%s] to a spoken language.", g);
            }
            objArr[0] = g;
            return qVar.getString(R.string.assistant_speaker_id_enrollment_device_lang_not_supported_toast, objArr);
        }
        return LinkUtil.m133791a((Spannable) Html.fromHtml(qVar.getString(R.string.max_users_limit_reached_message, new Object[]{Uri.parse(qVar.getString(R.string.max_users_limit_reached_message_help_doc_url)).buildUpon().appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build()}), 0));
    }

    /* renamed from: f */
    public final void mo77441f(boolean z) {
    }

    /* renamed from: g */
    public final boolean mo77442g() {
        return this.f262321d == 2;
    }

    /* renamed from: h */
    public final boolean mo77443h() {
        return false;
    }

    /* renamed from: i */
    public final boolean mo77444i() {
        return false;
    }

    /* renamed from: j */
    public final boolean mo77445j() {
        return true;
    }
}
