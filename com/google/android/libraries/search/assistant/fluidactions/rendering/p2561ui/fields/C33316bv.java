package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.bv */
/* compiled from: PG */
final class C33316bv extends C0640fb {

    /* renamed from: a */
    public final List f89312a;

    /* renamed from: b */
    final /* synthetic */ ListField f89313b;

    public C33316bv(ListField listField, List list) {
        this.f89313b = listField;
        this.f89312a = list;
    }

    public final int getItemCount() {
        return this.f89312a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C33315bu buVar = (C33315bu) ghVar;
        C51027dr drVar = (C51027dr) this.f89312a.get(i);
        buVar.f89306a.setVisibility(8);
        buVar.f89307b.setVisibility(8);
        buVar.f89308c.setVisibility(8);
        buVar.f89309d.setVisibility(8);
        buVar.f89310e.setVisibility(8);
        if ((drVar.f132854a & 128) != 0) {
            ImageComponent imageComponent = buVar.f89306a;
            imageComponent.f88960e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo38649b(dcVar, (Drawable) null);
            buVar.f89306a.setVisibility(0);
        }
        if (drVar.f132855b == 2) {
            buVar.f89307b.setText((String) drVar.f132856c);
            buVar.f89307b.setVisibility(0);
        } else {
            C51012dc dcVar2 = drVar.f132864k;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            if ((dcVar2.f132815a & 32) != 0) {
                try {
                    PackageManager packageManager = this.f89313b.getContext().getPackageManager();
                    C51012dc dcVar3 = drVar.f132864k;
                    if (dcVar3 == null) {
                        dcVar3 = C51012dc.f132813k;
                    }
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(dcVar3.f132821g, 128);
                    buVar.f89307b.setText((String) this.f89313b.getContext().getPackageManager().getApplicationLabel(applicationInfo));
                    buVar.f89307b.setVisibility(0);
                } catch (PackageManager.NameNotFoundException e) {
                    C59052c cVar = (C59052c) ((C59052c) ((C59052c) ListField.f89122a.mo56225c()).mo56382g(e)).mo56372aa(51089);
                    C51012dc dcVar4 = drVar.f132864k;
                    if (dcVar4 == null) {
                        dcVar4 = C51012dc.f132813k;
                    }
                    cVar.mo56389s("Invalid package name: %s", dcVar4.f132821g);
                }
            }
        }
        if ((drVar.f132854a & 16) != 0) {
            buVar.f89308c.setText(drVar.f132861h);
            buVar.f89308c.setVisibility(0);
        }
        if ((drVar.f132854a & 32) != 0) {
            buVar.f89309d.setText(drVar.f132862i);
            buVar.f89309d.setVisibility(0);
        }
        if ((drVar.f132854a & 64) != 0) {
            buVar.f89310e.setText(drVar.f132863j);
            buVar.f89310e.setVisibility(0);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33315bu(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fa_list_field_vertical_list_item, viewGroup, false));
    }
}
