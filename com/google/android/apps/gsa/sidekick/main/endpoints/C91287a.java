package com.google.android.apps.gsa.sidekick.main.endpoints;

import android.content.Context;
import android.content.SharedPreferences;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7159c.C90888av;
import com.google.common.base.C58827ar;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.sidekick.main.endpoints.a */
/* compiled from: PG */
final class C91287a extends C90888av {

    /* renamed from: a */
    final /* synthetic */ Context f254781a;

    /* renamed from: b */
    final /* synthetic */ String f254782b;

    /* renamed from: c */
    final /* synthetic */ String f254783c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C91287a(Context context, String str, String str2) {
        super("Presenter account switch", 1, 8);
        this.f254781a = context;
        this.f254782b = str;
        this.f254783c = str2;
    }

    public final void run() {
        Context context = this.f254781a;
        C90748e.m148224b();
        SharedPreferences sharedPreferences = context.getSharedPreferences("AccountSwitcherDrawerPresenter.Prefs", 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (this.f254782b == null) {
            edit.remove("recent_accounts");
        } else if (this.f254783c != null) {
            C90748e.m148224b();
            ArrayList arrayList = new ArrayList(Arrays.asList(sharedPreferences.getString("recent_accounts", BuildConfig.FLAVOR).split(",")));
            if (arrayList.contains(this.f254782b)) {
                arrayList.remove(this.f254782b);
            }
            if (arrayList.contains(this.f254783c)) {
                arrayList.remove(this.f254783c);
            }
            if (arrayList.size() == 2) {
                arrayList.remove(1);
            }
            arrayList.add(0, this.f254783c);
            edit.putString("recent_accounts", new C58827ar(",").mo56097d(arrayList));
        }
        edit.apply();
    }
}
