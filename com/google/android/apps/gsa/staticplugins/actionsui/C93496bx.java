package com.google.android.apps.gsa.staticplugins.actionsui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.shared.actions.SoundSearchResult;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88509c;
import com.google.android.apps.gsa.search.shared.p6941ui.actions.C88512f;
import com.google.android.apps.gsa.sidekick.shared.util.C91958ai;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.bx */
/* compiled from: PG */
public final class C93496bx extends C93503i {

    /* renamed from: d */
    private static final C59071e f260953d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.actionsui.bx");

    /* renamed from: e */
    private final Context f260954e;

    public C93496bx(C88512f fVar, Context context, C58833ax axVar) {
        super(fVar, axVar);
        this.f260954e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82048k() {
        CharSequence charSequence;
        Drawable drawable;
        PackageManager packageManager;
        String str;
        C88509c cVar = this.f239227c;
        cVar.getClass();
        C93495bw bwVar = (C93495bw) cVar;
        SoundSearchResult soundSearchResult = (SoundSearchResult) this.f239226b;
        Uri uri = null;
        if (soundSearchResult.f236037m == 1) {
            String str2 = soundSearchResult.f236034j;
            if (!TextUtils.isEmpty(str2)) {
                ViewGroup.LayoutParams a = bwVar.mo87803a();
                String format = String.format(Locale.US, "w%d-h%d", new Object[]{Integer.valueOf(a.width), Integer.valueOf(a.height)});
                if (C91958ai.m150914d(str2)) {
                    uri = C91958ai.m150911a(format, Uri.parse(str2));
                } else if (str2.endsWith("?fife")) {
                    uri = Uri.parse(str2 + "=" + format);
                } else {
                    uri = Uri.parse(str2);
                }
            }
            bwVar.mo87805w(soundSearchResult.f236030f, soundSearchResult.f236032h, soundSearchResult.f236031g, uri);
            return;
        }
        String str3 = soundSearchResult.f236030f;
        String str4 = soundSearchResult.f236032h;
        String str5 = soundSearchResult.f236031g;
        try {
            PackageManager packageManager2 = this.f260954e.getPackageManager();
            String str6 = ((SoundSearchResult) this.f239226b).f236036l;
            if (!(packageManager2 == null || str6 == null)) {
                charSequence = packageManager2.getApplicationLabel(packageManager2.getApplicationInfo(str6, 0));
                CharSequence charSequence2 = charSequence;
                packageManager = this.f260954e.getPackageManager();
                str = ((SoundSearchResult) this.f239226b).f236036l;
                if (!(packageManager == null || str == null)) {
                    drawable = packageManager.getApplicationIcon(str);
                    bwVar.mo87804v(str3, str4, str5, charSequence2, drawable, soundSearchResult.f236035k);
                }
                drawable = null;
                bwVar.mo87804v(str3, str4, str5, charSequence2, drawable, soundSearchResult.f236035k);
            }
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f260953d.mo56225c()).mo56382g(e)).mo56372aa(13731)).mo56386p("Application name not found");
        }
        charSequence = BuildConfig.FLAVOR;
        CharSequence charSequence22 = charSequence;
        try {
            packageManager = this.f260954e.getPackageManager();
            str = ((SoundSearchResult) this.f239226b).f236036l;
            drawable = packageManager.getApplicationIcon(str);
        } catch (PackageManager.NameNotFoundException e2) {
            ((C59052c) ((C59052c) ((C59052c) f260953d.mo56225c()).mo56382g(e2)).mo56372aa(13730)).mo56386p("Application name not found");
        }
        bwVar.mo87804v(str3, str4, str5, charSequence22, drawable, soundSearchResult.f236035k);
    }
}
