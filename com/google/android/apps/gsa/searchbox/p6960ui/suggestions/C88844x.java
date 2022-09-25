package com.google.android.apps.gsa.searchbox.p6960ui.suggestions;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.C88709j;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.p3202c.C41644b;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.common.p4522b.C58528ij;
import com.google.p4017at.p4060h.p4073d.p4074a.C54224am;
import java.util.Collections;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.x */
/* compiled from: PG */
public final class C88844x {

    /* renamed from: a */
    public static final C58528ij f240541a = C58528ij.m90015O(C41669ai.f108958g, C41669ai.f108960i, C41669ai.f108972u, C41669ai.f108954c, C41669ai.f108961j, C41669ai.f108956e, C41669ai.f108968q);

    /* renamed from: b */
    public static final C41644b[] f240542b = {C41669ai.f108973v, C41669ai.f108971t, C41669ai.f108967p, C41669ai.f108974w};

    /* renamed from: a */
    public static String m144242a(int i, Response response, Context context, C88709j jVar) {
        C54224am amVar = response.f108868h.f142371k;
        if (amVar == null) {
            amVar = C54224am.f142322b;
        }
        String str = (String) Collections.unmodifiableMap(amVar.f142324a).get(Integer.valueOf(i));
        if (str != null) {
            return str;
        }
        if (jVar == null || !jVar.f239859P || (i != C41669ai.f108958g.intValue() && i != C41669ai.f108961j.intValue())) {
            return i == C41669ai.f108961j.intValue() ? context.getResources().getString(R.string.on_device_header_text) : BuildConfig.FLAVOR;
        }
        return context.getResources().getString(R.string.app_strip_header_text);
    }

    /* renamed from: b */
    public static boolean m144243b(Context context) {
        return !C90685b.m148054b(context, (C90021c) null);
    }
}
