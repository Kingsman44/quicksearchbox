package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.fields;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components.ImageComponent;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2562a.C33241c;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import java.util.List;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.fields.ac */
/* compiled from: PG */
final class C33270ac extends C0640fb {

    /* renamed from: a */
    public final List f89225a;

    /* renamed from: b */
    final /* synthetic */ C33272ae f89226b;

    /* renamed from: c */
    private final Context f89227c;

    /* renamed from: d */
    private final boolean f89228d;

    /* renamed from: e */
    private final boolean f89229e;

    public C33270ac(C33272ae aeVar, List list, Context context, boolean z, boolean z2) {
        this.f89226b = aeVar;
        this.f89225a = list;
        this.f89227c = context;
        this.f89228d = z;
        this.f89229e = z2;
    }

    public final int getItemCount() {
        return this.f89225a.size();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        C33269ab abVar = (C33269ab) ghVar;
        C51027dr drVar = (C51027dr) this.f89225a.get(i);
        abVar.f89219a.setVisibility(8);
        abVar.f89220b.setVisibility(8);
        abVar.f89221c.setVisibility(8);
        abVar.f89222d.setVisibility(8);
        abVar.f89223e.setVisibility(8);
        C33241c cVar = null;
        if (this.f89228d && drVar.f132855b == 2) {
            Context context = this.f89227c;
            String str = (String) drVar.f132856c;
            cVar = C33241c.m61663a(context, str, str);
        }
        if (this.f89229e) {
            abVar.f89219a.setVisibility(0);
            abVar.f89220b.setVisibility(0);
            ImageComponent imageComponent = abVar.f89220b;
            imageComponent.f88960e = true;
            C51012dc dcVar = drVar.f132864k;
            if (dcVar == null) {
                dcVar = C51012dc.f132813k;
            }
            imageComponent.mo38649b(dcVar, cVar);
        } else {
            abVar.f89221c.setVisibility(0);
            ImageComponent imageComponent2 = abVar.f89221c;
            imageComponent2.f88960e = true;
            C51012dc dcVar2 = drVar.f132864k;
            if (dcVar2 == null) {
                dcVar2 = C51012dc.f132813k;
            }
            imageComponent2.mo38649b(dcVar2, cVar);
        }
        int i2 = drVar.f132855b;
        if (i2 == 6) {
            String str2 = (String) drVar.f132856c;
            try {
                PackageManager packageManager = this.f89227c.getPackageManager();
                abVar.f89222d.setText(packageManager.getApplicationLabel(packageManager.getApplicationInfo(str2, 0)));
                abVar.f89222d.setVisibility(0);
            } catch (PackageManager.NameNotFoundException unused) {
                if ((drVar.f132854a & 8) != 0) {
                    abVar.f89222d.setText(drVar.f132860g);
                    abVar.f89222d.setVisibility(0);
                }
            }
        } else if (i2 == 2) {
            abVar.f89222d.setText((String) drVar.f132856c);
            abVar.f89222d.setVisibility(0);
        }
        if ((drVar.f132854a & 16) != 0) {
            abVar.f89223e.setText(drVar.f132861h);
            abVar.f89223e.setVisibility(0);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C33269ab(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fa_contact_disambiguation_list_item, viewGroup, false));
    }
}
