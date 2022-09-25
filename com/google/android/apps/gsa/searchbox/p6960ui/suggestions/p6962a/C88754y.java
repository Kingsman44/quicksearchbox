package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.y */
/* compiled from: PG */
public final class C88754y extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f240098a;

    public C88754y(Context context) {
        this.f240098a = context;
    }

    /* renamed from: n */
    private static boolean m143886n(Suggestion suggestion) {
        return suggestion.f108915p.equals(C41669ai.f108958g);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 110;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        return m143886n(suggestion) ? 4 : 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240098a.getResources().getString(R.string.on_device_app_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        if (m143886n(suggestion)) {
            ImageView imageView = (ImageView) ((View) anVar).findViewById(R.id.label_icon);
            if (imageView.getDrawable() == null) {
                return false;
            }
            return this.f240007m.mo82302D(suggestion, imageView);
        }
        this.f240011q.mo82469z(R.string.regular_app_suggestion_message, (Suggestion) null, false);
        return true;
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        Drawable h;
        anVar.mo82587v(this.f240010p.mo44237d(suggestion.mo44269v(), BuildConfig.FLAVOR, false));
        String g = C89235z.m145135g(suggestion);
        if (g == null || (h = C88727aj.m143703h(this.f240098a.getPackageManager(), g)) == null) {
            return false;
        }
        anVar.mo82349c(0).mo82563f(h, -1);
        return true;
    }
}
