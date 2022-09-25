package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83914a;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83915b;
import com.google.android.apps.gsa.shared.proto.p7126io.ProtoLiteParcelable;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.MessageLite;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fv */
/* compiled from: PG */
public final class C96226fv extends C96363kx {

    /* renamed from: d */
    public static final /* synthetic */ int f269349d = 0;

    /* renamed from: e */
    private static final C59071e f269350e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.fv");

    /* renamed from: b */
    C83915b f269351b;

    /* renamed from: c */
    public boolean f269352c;

    /* renamed from: f */
    private String f269353f;

    /* renamed from: g */
    public static Bundle m159528g(String str, C83915b bVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("tag", str);
        bundle.putParcelable("dlg", new ProtoLiteParcelable((MessageLite) bVar));
        bundle.putBoolean("fatal", z);
        return bundle;
    }

    /* renamed from: h */
    public static Bundle m159529h(String str, int i) {
        C83914a aVar = (C83914a) C83915b.f228541j.createBuilder();
        aVar.copyOnWrite();
        C83915b bVar = (C83915b) aVar.instance;
        bVar.f228543a |= 8;
        bVar.f228547e = i;
        aVar.copyOnWrite();
        C83915b bVar2 = (C83915b) aVar.instance;
        bVar2.f228543a |= 32;
        bVar2.f228549g = R.string.network_error_try_again;
        aVar.copyOnWrite();
        C83915b bVar3 = (C83915b) aVar.instance;
        bVar3.f228543a |= 128;
        bVar3.f228551i = R.string.cancel;
        return m159528g(str, (C83915b) aVar.build(), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final String mo89934e() {
        String str = this.f269353f;
        str.getClass();
        return str;
    }

    public final void onCreate(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getClass();
        String string = arguments.getString("tag");
        string.getClass();
        this.f269353f = string;
        C59104x b = f269350e.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GenericAlertDialogFrag");
        ((C59052c) ((C59052c) b).mo56372aa(16998)).mo56389s("Showing Alert for %s", this.f269353f);
        ProtoLiteParcelable protoLiteParcelable = (ProtoLiteParcelable) getArguments().getParcelable("dlg");
        protoLiteParcelable.getClass();
        C83915b bVar = (C83915b) protoLiteParcelable.mo84191d(C83915b.f228541j.getParserForType());
        bVar.getClass();
        this.f269351b = bVar;
        this.f269352c = getArguments().getBoolean("fatal", false);
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        C83915b bVar = this.f269351b;
        bVar.getClass();
        if ((bVar.f228543a & 2) != 0) {
            builder.setTitle(bVar.f228545c);
        }
        builder.setMessage(this.f269351b.f228547e);
        if (!this.f269352c) {
            builder.setNegativeButton(this.f269351b.f228551i, new C96223fs(this));
        }
        builder.setOnDismissListener(new C96224ft(this)).setPositiveButton(this.f269351b.f228549g, C96225fu.f269348a).create().show();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
