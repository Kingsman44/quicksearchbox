package com.google.android.apps.gsa.searchbox.p6960ui.suggestions.p6962a;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannedString;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.gsa.searchbox.p6960ui.C88711l;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88803an;
import com.google.android.apps.gsa.searchbox.p6960ui.suggestions.views.C88838v;
import com.google.android.apps.gsa.shared.p6990an.C89235z;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89199d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41670aj;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.android.libraries.searchbox.shared.suggestion.C41699y;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.protobuf.C63088z;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.apps.gsa.searchbox.ui.suggestions.a.n */
/* compiled from: PG */
public final class C88743n extends C88728ak implements C89199d {

    /* renamed from: a */
    private final Context f240071a;

    public C88743n(Context context) {
        this.f240071a = context;
    }

    /* renamed from: n */
    private static boolean m143859n(Suggestion suggestion) {
        return suggestion.f108915p.equals(C41669ai.f108958g);
    }

    /* renamed from: b */
    public final int mo82327b() {
        return 84;
    }

    /* renamed from: c */
    public final int mo82328c(Suggestion suggestion) {
        if (suggestion.f108925z.contains(223)) {
            return 43;
        }
        return m143859n(suggestion) ? 4 : 57;
    }

    /* renamed from: e */
    public final String mo82329e(Suggestion suggestion) {
        return this.f240071a.getResources().getString(R.string.on_device_app_suggestion_content_description, new Object[]{suggestion.mo44269v()});
    }

    /* renamed from: hH */
    public final boolean mo82330hH(C88803an anVar, Suggestion suggestion) {
        C41679e eVar = suggestion.f108907B;
        if ((eVar.f109007a & 1024) != 0) {
            C41699y yVar = eVar.f109017k;
            if (yVar == null) {
                yVar = C41699y.f109072f;
            }
            if ((yVar.f109074a & 1) != 0 && m143859n(suggestion) && suggestion.f108925z.contains(223)) {
                return this.f240007m.mo82302D(suggestion, (View) anVar);
            }
        }
        if (!m143859n(suggestion) || suggestion.f108925z.contains(223)) {
            this.f240011q.mo82469z(R.string.regular_app_suggestion_message, suggestion, false);
            return true;
        }
        ImageView imageView = (ImageView) ((View) anVar).findViewById(R.id.label_icon);
        if (imageView.getDrawable() == null) {
            return false;
        }
        return this.f240007m.mo82302D(suggestion, imageView);
    }

    /* renamed from: hI */
    public final boolean mo82331hI(Suggestion suggestion, C88803an anVar) {
        anVar.mo82587v(SpannedString.valueOf(C89235z.m145132d(suggestion)));
        if (suggestion.f108925z.contains(223)) {
            anVar.mo82585s().setOnTouchListener(new C88711l());
            C41699y yVar = suggestion.f108907B.f109017k;
            if (yVar == null) {
                yVar = C41699y.f109072f;
            }
            if (this.f240013s.f239896v || (yVar.f109074a & 2) == 0) {
                ((C88838v) anVar).mo82618n(yVar.f109075b, false, 0, this.f240008n);
            } else {
                C63088z zVar = yVar.f109076c;
                Bitmap createBitmap = Bitmap.createBitmap(yVar.f109077d, yVar.f109078e, Bitmap.Config.ARGB_8888);
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(zVar.mo59031d());
                zVar.mo59044p(allocateDirect);
                allocateDirect.rewind();
                createBitmap.copyPixelsFromBuffer(allocateDirect);
                C88838v vVar = (C88838v) anVar;
                if (vVar.mo82619p(createBitmap)) {
                    createBitmap = Bitmap.createScaledBitmap(createBitmap, vVar.f240509g, vVar.f240510h, true);
                }
                vVar.f240504b.setImageViewBitmap(16908294, createBitmap);
                vVar.f240504b.reapply(vVar.f240503a, vVar.f240505c);
            }
        } else if (C41670aj.m73086s(suggestion)) {
            anVar.mo82349c(0).mo82561d(C41670aj.m73068a(suggestion), 0, false);
        } else {
            anVar.mo82349c(0).mo82564g(C41670aj.m73072e(suggestion), C41670aj.m73081n(suggestion), this.f240008n);
        }
        return true;
    }
}
