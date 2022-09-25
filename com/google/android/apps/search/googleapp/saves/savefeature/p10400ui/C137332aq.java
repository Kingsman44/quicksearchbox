package com.google.android.apps.search.googleapp.saves.savefeature.p10400ui;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.googleapp.incognito.lifecycleobserver.IncognitoLifecycleObserver;
import com.google.android.apps.search.googleapp.incognito.p10324e.C136247a;
import com.google.android.apps.search.googleapp.saves.savefeature.C137300h;
import com.google.android.apps.search.googleapp.saves.savefeature.p10392a.C137274p;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.p4283bv.p4369f.p4370a.p4371a.C57578av;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.search.googleapp.saves.savefeature.ui.aq */
/* compiled from: PG */
public final class C137332aq {

    /* renamed from: a */
    public static final C59071e f373558a = C59071e.m91332i("com.google.android.apps.search.googleapp.saves.savefeature.ui.aq");

    /* renamed from: b */
    public final AccountId f373559b;

    /* renamed from: c */
    public final C137328am f373560c;

    /* renamed from: d */
    public final C47770dh f373561d;

    /* renamed from: e */
    public final C137274p f373562e;

    /* renamed from: f */
    public final C46439e f373563f;

    /* renamed from: g */
    public final C46401p f373564g;

    /* renamed from: h */
    public final C136247a f373565h;

    /* renamed from: i */
    public C137300h f373566i = C137300h.f373505h;

    /* renamed from: j */
    public final C46440f f373567j = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            ((C59052c) ((C59052c) ((C59052c) C137332aq.f373558a.mo56226d()).mo56382g(th)).mo56372aa(40963)).mo56386p("Save item failed.");
            Snackbar.m79661q((Context) null, C137332aq.this.f373560c.requireView(), C137332aq.this.f373560c.getResources().getString(R.string.googleapp_save_feature_error_title), 0).mo48343h();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj;
            ProtoParsers.ParcelableProto parcelableProto2 = (ProtoParsers.ParcelableProto) obj2;
            C137332aq.this.mo113657b();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    };

    public C137332aq(AccountId accountId, C137328am amVar, C47770dh dhVar, C137274p pVar, InstanceStateStoreFactory instanceStateStoreFactory, C46439e eVar, IncognitoLifecycleObserver incognitoLifecycleObserver, C136247a aVar) {
        this.f373559b = accountId;
        this.f373560c = amVar;
        this.f373561d = dhVar;
        this.f373562e = pVar;
        this.f373564g = instanceStateStoreFactory.mo50325a("list_proto", C57578av.f153822h);
        this.f373563f = eVar;
        this.f373565h = aVar;
        incognitoLifecycleObserver.mo112948g();
    }

    /* renamed from: c */
    public static void m223126c(View view, C57578av avVar) {
        ((TextView) view.findViewById(R.id.googleapp_selected_list_text)).setText(avVar.f153828e);
    }

    /* renamed from: a */
    public final C137370s mo113656a() {
        return (C137370s) this.f373560c.getChildFragmentManager().f634a.mo671c("saveListPicker");
    }

    /* renamed from: b */
    public final void mo113657b() {
        this.f373560c.requireActivity().finish();
    }
}
