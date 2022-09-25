package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113321r;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.av */
/* compiled from: PG */
public final /* synthetic */ class C112742av implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C0673gh f312515a;

    public /* synthetic */ C112742av(C0673gh ghVar) {
        this.f312515a = ghVar;
    }

    public final void onClick(View view) {
        C0673gh ghVar = this.f312515a;
        C112748ba baVar = (C112748ba) ghVar.mBindingAdapter;
        int absoluteAdapterPosition = ghVar.getAbsoluteAdapterPosition();
        if (baVar != null && absoluteAdapterPosition != -1) {
            Context context = view.getContext();
            if (baVar.getItemViewType(absoluteAdapterPosition) == 0) {
                C113321r a = ((C112746az) baVar.mo99723a().get(absoluteAdapterPosition)).mo99687a();
                try {
                    long parseLong = Long.parseLong(a.f313841h);
                    C112775ca caVar = (C112775ca) baVar.f312530d.mo27525b();
                    C112775ca.m186636a(context, new Intent("android.intent.action.VIEW").setDataAndType(ContentUris.withAppendedId(ContactsContract.Data.CONTENT_URI, parseLong), a.f313839f));
                } catch (NumberFormatException unused) {
                    ((C59052c) ((C59052c) C112748ba.f312527a.mo56226d()).mo56372aa(27790)).mo56389s("Impossible scenario where CP2 primary Id (value=%s) is not numeric, check parsing logic", a.f313841h);
                }
            } else {
                String str = ((C112746az) baVar.mo99723a().get(absoluteAdapterPosition)).mo99687a().f313835b;
                if (str.isEmpty()) {
                    ((C59052c) ((C59052c) C112748ba.f312527a.mo56226d()).mo56372aa(27791)).mo56386p("Cannot navigate to SMS app, phone number is empty.");
                    return;
                }
                C112775ca caVar2 = (C112775ca) baVar.f312530d.mo27525b();
                C112775ca.m186636a(context, new Intent("android.intent.action.VIEW", Uri.parse("sms:".concat(String.valueOf(str)))));
            }
        }
    }
}
