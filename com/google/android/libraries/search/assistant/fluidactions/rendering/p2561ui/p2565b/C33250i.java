package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.b.i */
/* compiled from: PG */
final class C33250i extends C0640fb {

    /* renamed from: a */
    public final List f88910a;

    /* renamed from: b */
    final /* synthetic */ C33252k f88911b;

    /* renamed from: c */
    private final Context f88912c;

    public C33250i(C33252k kVar, Context context, List list) {
        this.f88911b = kVar;
        this.f88910a = list;
        this.f88912c = context;
    }

    public final int getItemCount() {
        return this.f88910a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C33249h hVar = (C33249h) ghVar;
        C51027dr drVar = (C51027dr) this.f88910a.get(i);
        ImageComponent imageComponent = hVar.f88908b;
        TextView textView = hVar.f88907a;
        imageComponent.setVisibility(8);
        textView.setVisibility(8);
        if ((drVar.f132854a & 128) != 0) {
            imageComponent.f88960e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo38649b(dcVar, (Drawable) null);
            imageComponent.setVisibility(0);
        }
        if (drVar.f132855b == 2) {
            textView.setText((String) drVar.f132856c);
            textView.setVisibility(0);
            return;
        }
        C51012dc dcVar2 = drVar.f132864k;
        if (dcVar2 == null) {
            dcVar2 = C51012dc.f132813k;
        }
        if ((dcVar2.f132815a & 32) != 0) {
            try {
                Context context = this.f88911b.getContext();
                context.getClass();
                PackageManager packageManager = context.getPackageManager();
                C51012dc dcVar3 = drVar.f132864k;
                if (dcVar3 == null) {
                    dcVar3 = C51012dc.f132813k;
                }
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(dcVar3.f132821g, 128);
                Context context2 = this.f88911b.getContext();
                context2.getClass();
                textView.setText((String) context2.getPackageManager().getApplicationLabel(applicationInfo));
                textView.setVisibility(0);
            } catch (PackageManager.NameNotFoundException e) {
                C59052c cVar = (C59052c) ((C59052c) ((C59052c) C33252k.f88913a.mo56225c()).mo56382g(e)).mo56372aa(51169);
                C51012dc dcVar4 = drVar.f132864k;
                if (dcVar4 == null) {
                    dcVar4 = C51012dc.f132813k;
                }
                cVar.mo56389s("Invalid package name: %s", dcVar4.f132821g);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33249h(this, LayoutInflater.from(this.f88912c).inflate(R.layout.fa_list_item_picker_list_item, viewGroup, false));
    }
}
