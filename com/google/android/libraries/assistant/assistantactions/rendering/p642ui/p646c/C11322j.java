package com.google.android.libraries.assistant.assistantactions.rendering.p642ui.p646c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.rendering.p642ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.assistantactions.rendering.ui.c.j */
/* compiled from: PG */
public final class C11322j extends C0640fb {

    /* renamed from: a */
    public final List f36790a;

    /* renamed from: b */
    final /* synthetic */ C11324l f36791b;

    /* renamed from: c */
    private final Context f36792c;

    public C11322j(C11324l lVar, Context context, List list) {
        this.f36791b = lVar;
        this.f36790a = list;
        this.f36792c = context;
    }

    public final int getItemCount() {
        return this.f36790a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C11321i iVar = (C11321i) ghVar;
        C51027dr drVar = (C51027dr) this.f36790a.get(i);
        ImageComponent imageComponent = iVar.f36788b;
        TextView textView = iVar.f36787a;
        imageComponent.setVisibility(8);
        textView.setVisibility(8);
        if ((drVar.f132854a & 128) != 0) {
            imageComponent.f36858e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo19786b(dcVar, (Drawable) null);
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
                PackageManager packageManager = this.f36791b.getContext().getPackageManager();
                C51012dc dcVar3 = drVar.f132864k;
                if (dcVar3 == null) {
                    dcVar3 = C51012dc.f132813k;
                }
                textView.setText((String) this.f36791b.getContext().getPackageManager().getApplicationLabel(packageManager.getApplicationInfo(dcVar3.f132821g, 128)));
                textView.setVisibility(0);
            } catch (PackageManager.NameNotFoundException e) {
                C59052c cVar = (C59052c) ((C59052c) ((C59052c) C11324l.f36793a.mo56225c()).mo56382g(e)).mo56372aa(43295);
                C51012dc dcVar4 = drVar.f132864k;
                if (dcVar4 == null) {
                    dcVar4 = C51012dc.f132813k;
                }
                cVar.mo56389s("Invalid package name: %s", dcVar4.f132821g);
            }
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C11321i(this, LayoutInflater.from(this.f36792c).inflate(R.layout.list_item_picker_list_item_view, viewGroup, false));
    }
}
