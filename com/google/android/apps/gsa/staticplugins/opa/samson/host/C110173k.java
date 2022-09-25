package com.google.android.apps.gsa.staticplugins.opa.samson.host;

import android.app.PendingIntent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1356b.p1362c.C16929a;
import com.google.android.libraries.assistant.p1356b.p1362c.C16930b;
import com.google.android.libraries.assistant.p1356b.p1362c.C16931c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.host.k */
/* compiled from: PG */
public final /* synthetic */ class C110173k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C110176n f306991a;

    /* renamed from: b */
    public final /* synthetic */ Bundle f306992b;

    public /* synthetic */ C110173k(C110176n nVar, Bundle bundle) {
        this.f306991a = nVar;
        this.f306992b = bundle;
    }

    public final void run() {
        TextView textView;
        Bundle bundle;
        int i;
        PendingIntent pendingIntent;
        Bundle bundle2;
        String string;
        C110176n nVar = this.f306991a;
        Bundle bundle3 = this.f306992b;
        if (nVar.f307006l) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        C58976aa aaVar2 = C58975e.f156826a;
        nVar.f306999e.removeAllViews();
        ArrayList arrayList = new ArrayList();
        ArrayList<C16930b> arrayList2 = new ArrayList<>();
        if (bundle3 != null) {
            bundle3.setClassLoader(C16931c.class.getClassLoader());
            ArrayList parcelableArrayList = bundle3.getParcelableArrayList("suggestion_chips");
            if (parcelableArrayList != null) {
                for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
                    Parcelable parcelable = (Parcelable) parcelableArrayList.get(i2);
                    if ((parcelable instanceof Bundle) && (string = bundle2.getString("query_string")) != null) {
                        PendingIntent pendingIntent2 = (PendingIntent) C16931c.m33934a((bundle2 = (Bundle) parcelable), "chip_intent", PendingIntent.class);
                        Icon icon = (Icon) C16931c.m33934a(bundle2, "chip_icon", Icon.class);
                        if (pendingIntent2 != null) {
                            arrayList.add(new C16929a(pendingIntent2, string));
                        }
                    }
                }
                arrayList2.addAll(arrayList);
            }
            ArrayList parcelableArrayList2 = bundle3.getParcelableArrayList("entry_points");
            if (parcelableArrayList2 != null) {
                for (int i3 = 0; i3 < parcelableArrayList2.size(); i3++) {
                    Parcelable parcelable2 = (Parcelable) parcelableArrayList2.get(i3);
                    if ((parcelable2 instanceof Bundle) && (i = bundle.getInt("ui_element_type", -1)) >= 0 && (pendingIntent = (PendingIntent) C16931c.m33934a(bundle, "entry_point_intent", PendingIntent.class)) != null) {
                        Icon icon2 = (Icon) C16931c.m33934a((bundle = (Bundle) parcelable2), "entry_point_icon", Icon.class);
                        arrayList2.add(new C16930b(i, pendingIntent));
                    }
                }
            }
        }
        nVar.f307004j = bundle3.getByteArray("impression_bytes");
        boolean z = false;
        char c = 0;
        for (C16930b bVar : arrayList2) {
            if (bVar != null && bVar.f49475c == 0 && (bVar instanceof C16929a) && c <= 0) {
                C16929a aVar = (C16929a) bVar;
                ViewGroup viewGroup = nVar.f306999e;
                String str = aVar.f49473a;
                if (TextUtils.isEmpty(str)) {
                    textView = null;
                } else {
                    TextView textView2 = (TextView) nVar.f307001g.inflate(R.layout.ambient_conv_starter, viewGroup, false);
                    textView2.setText(str.toString());
                    textView2.setOnClickListener(new C110170h(aVar.f49474b));
                    textView = textView2;
                }
                if (textView != null) {
                    nVar.f306999e.addView(textView);
                    c = 1;
                }
            } else if (bVar.f49475c == 1) {
                nVar.f307000f.setOnClickListener(new C110169g(bVar.f49474b));
                z = true;
            }
        }
        ViewGroup viewGroup2 = nVar.f306999e;
        viewGroup2.setVisibility(viewGroup2.getChildCount() > 0 ? 0 : 8);
        if (z && nVar.f306998d.getVisibility() != 0) {
            nVar.f306998d.setVisibility(0);
            nVar.f307006l = true;
        }
        Runnable runnable = nVar.f307003i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
