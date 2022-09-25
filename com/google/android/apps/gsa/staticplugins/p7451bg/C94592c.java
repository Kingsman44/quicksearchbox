package com.google.android.apps.gsa.staticplugins.p7451bg;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6513aj.p6514a.C84515a;
import com.google.android.apps.gsa.search.core.p6519al.p6558as.C84730a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p7025bh.p7026a.C89429a;
import com.google.android.apps.gsa.shared.p7037e.C89720f;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import dagger.C68214a;
import java.io.FileNotFoundException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bg.c */
/* compiled from: PG */
public final class C94592c extends C86734a implements C84730a {

    /* renamed from: a */
    private static final C59071e f264570a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bg.c");

    /* renamed from: b */
    private final Context f264571b;

    /* renamed from: c */
    private final C68214a f264572c;

    /* renamed from: f */
    private final C84515a f264573f;

    /* renamed from: g */
    private final C68214a f264574g;

    public C94592c(Context context, C84515a aVar, C68214a aVar2, C68214a aVar3) {
        super(C118575h.WORKER_HOMESCREEN_SHORTCUT, "homescreenshortcut");
        this.f264571b = context;
        this.f264573f = aVar;
        this.f264572c = aVar2;
        this.f264574g = aVar3;
    }

    /* renamed from: c */
    private final C58833ax m155971c(String str) {
        C58836b bVar = C58836b.f156633a;
        try {
            return C58833ax.m90834k((Integer) C90772bp.m148303k(this.f264571b, Uri.parse(str)).second);
        } catch (FileNotFoundException e) {
            C59104x c = f264570a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "HomescreenShortcutWork");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20222)).mo56389s("Cannot find id for uri. %s", str);
            return bVar;
        }
    }

    /* renamed from: a */
    public final C60870cx mo78446a(String str, String str2) {
        Intent c = C89429a.m145445c(this.f264571b, "and.gsa.launcher.icon.now.promo");
        Bitmap b = C90772bp.m148294b(this.f264571b.getDrawable(((Integer) m155971c(str2).mo56109e(Integer.valueOf(R.drawable.spark_lure_image))).intValue()));
        b.getClass();
        C60870cx g = C60922j.m93044g(((C89720f) this.f264572c.mo27525b()).mo83611a(this.f264571b.getResources().getString(((Integer) m155971c(str).mo56109e(Integer.valueOf(R.string.search_activity_name))).intValue()), b, c), new C94590a(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo78447b() {
        Intent e = this.f264573f.mo78222e("and.gsa.launcher.shortcut.voice");
        Bitmap b = C90772bp.m148294b(this.f264571b.getDrawable(R.drawable.ic_mic_color));
        b.getClass();
        String string = this.f264571b.getResources().getString(R.string.voice_search_shortcut_app_name);
        ((C91097g) this.f264574g.mo27525b()).mo65089a(new Intent("android.intent.action.MAIN").addFlags(268435456).addCategory("android.intent.category.HOME"));
        C60870cx g = C60922j.m93044g(((C89720f) this.f264572c.mo27525b()).mo83611a(string, b, e), new C94591b(), C60826bg.f164896a);
        C90476a aVar = C91018d.f254254a;
        return g;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
