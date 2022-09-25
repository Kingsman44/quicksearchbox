package com.google.android.libraries.lens.view.p2133i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.support.p033v7.widget.C0678gm;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.p265e.C5114a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26897b;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26913i;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26916l;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.lens.p4707j.C62583q;
import com.google.lens.p4707j.C62584r;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62953e;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.lens.view.i.t */
/* compiled from: PG */
public final class C26935t extends C0640fb {

    /* renamed from: a */
    private static final C59071e f73415a = C59071e.m91332i("com.google.android.libraries.lens.view.i.t");

    /* renamed from: b */
    private final LayoutInflater f73416b;

    /* renamed from: c */
    private final C21370a f73417c;

    /* renamed from: d */
    private final C28310af f73418d;

    /* renamed from: e */
    private final C26913i f73419e;

    /* renamed from: f */
    private final C28306ab f73420f;

    /* renamed from: g */
    private final C47770dh f73421g;

    /* renamed from: h */
    private final C26925j f73422h;

    public C26935t(LayoutInflater layoutInflater, C21370a aVar, C28310af afVar, C26913i iVar, C26925j jVar, C28306ab abVar, C47770dh dhVar) {
        this.f73416b = layoutInflater;
        this.f73417c = aVar;
        this.f73418d = afVar;
        this.f73419e = iVar;
        this.f73422h = jVar;
        this.f73420f = abVar;
        this.f73421g = dhVar;
    }

    public final int getItemCount() {
        return this.f73419e.mo32270a();
    }

    public final long getItemId(int i) {
        return (long) this.f73419e.mo32295k(i).hashCode();
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C0673gh ghVar, int i) {
        int i2;
        Drawable drawable;
        String str;
        C26934s sVar = (C26934s) ghVar;
        C26916l lVar = (C26916l) this.f73419e.mo32294j(this.f73419e.mo32295k(i)).mo56111f();
        if (lVar != null) {
            int a = this.f73419e.mo32270a();
            C21370a aVar = this.f73417c;
            sVar.itemView.setOnClickListener(new C47591co(sVar.f73414h, "Click device", new C26933r(this.f73422h, lVar)));
            ImageView imageView = sVar.f73407a;
            int i3 = 8;
            switch (lVar.mo32290c().f168970c) {
                case 0:
                    i2 = 2;
                    break;
                case 1:
                    i2 = 3;
                    break;
                case 2:
                    i2 = 4;
                    break;
                case 3:
                    i2 = 5;
                    break;
                case 4:
                    i2 = 6;
                    break;
                case 5:
                    i2 = 7;
                    break;
                case 6:
                    i2 = 8;
                    break;
                case 7:
                    i2 = 9;
                    break;
                default:
                    i2 = 0;
                    break;
            }
            if (i2 == 0) {
                i2 = 1;
            }
            Context context = sVar.itemView.getContext();
            C26897b bVar = C26897b.READY_TO_SEND;
            int i4 = i2 - 2;
            if (i4 == 1) {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_laptop_windows_black_24);
            } else if (i4 == 2) {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_laptop_mac_black_24);
            } else if (i4 == 3) {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_laptop_black_24);
            } else if (i4 == 4) {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_laptop_chromebook_black_24);
            } else if (i4 != 6) {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_phonelink_black_24);
            } else {
                drawable = C0678gm.m2375e().mo3100c(context, R.drawable.quantum_ic_smartphone_black_24);
            }
            imageView.setImageDrawable(drawable);
            sVar.f73409c.setText(lVar.mo32290c().f168969b);
            int ordinal = lVar.mo32288a().ordinal();
            if (ordinal == 0) {
                sVar.f73413g.mo33802c(sVar.itemView, sVar.f73412f.mo33805a(C28427h.m53115a(92164)));
                sVar.f73407a.setVisibility(0);
                sVar.f73408b.setVisibility(8);
                TextView textView = sVar.f73411e;
                if (a == 1) {
                    i3 = 0;
                }
                textView.setVisibility(i3);
                sVar.f73411e.setSelected(false);
                sVar.f73407a.setSelected(false);
                sVar.f73409c.setSelected(false);
                sVar.itemView.setSelected(false);
                long micros = TimeUnit.MILLISECONDS.toMicros(aVar.mo26870b());
                TimeUnit timeUnit = TimeUnit.MICROSECONDS;
                C63042fg fgVar = lVar.mo32290c().f168971d;
                if (fgVar == null) {
                    fgVar = C63042fg.f170152c;
                }
                sVar.f73410d.setText(C5114a.m13987a(sVar.itemView.getContext(), R.string.lens_cloud_copy_device_last_active_time, "count", Long.valueOf(timeUnit.toHours(micros - C62953e.m95477b(fgVar)))));
            } else if (ordinal == 1) {
                sVar.f73407a.setVisibility(8);
                sVar.f73408b.setVisibility(0);
                TextView textView2 = sVar.f73411e;
                if (a == 1) {
                    i3 = 0;
                }
                textView2.setVisibility(i3);
                sVar.f73411e.setSelected(true);
                sVar.f73409c.setSelected(true);
                sVar.itemView.setSelected(true);
                sVar.f73410d.setText(sVar.itemView.getResources().getString(R.string.lens_cloud_copy_in_progress));
            } else if (ordinal == 2) {
                sVar.f73413g.mo33802c(sVar.itemView, sVar.f73412f.mo33805a(C28427h.m53115a(101000)));
                sVar.f73407a.setVisibility(0);
                sVar.f73408b.setVisibility(8);
                sVar.f73411e.setVisibility(8);
                sVar.f73407a.setSelected(true);
                sVar.f73409c.setSelected(true);
                sVar.itemView.setSelected(true);
                Context context2 = sVar.itemView.getContext();
                Object[] objArr = new Object[2];
                objArr[0] = "CAPTION";
                C62963cj cjVar = new C62963cj(lVar.mo32290c().f168972e, C62584r.f168965f);
                if (cjVar.contains(C62583q.CHROME_OUTDATED)) {
                    str = "CHROME_OUTDATED";
                } else {
                    str = (cjVar.contains(C62583q.REMOTE_COPY_NOT_ENABLED) || cjVar.contains(C62583q.MISSING_ENCRYPTION_DATA)) ? "CHROME_NEEDS_RESTART" : cjVar.contains(C62583q.RECENTLY_INACTIVE) ? "RECENTLY_INACTIVE" : "OTHER";
                }
                objArr[1] = str;
                sVar.f73410d.setText(C5114a.m13987a(context2, R.string.lens_cloud_copy_device_not_eligible_caption, objArr));
            }
        } else {
            ((C59052c) ((C59052c) f73415a.mo56225c()).mo56372aa(49269)).mo56387q("Failed to bind view holder at position %s", i);
        }
    }

    public final /* bridge */ /* synthetic */ C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        View inflate = this.f73416b.inflate(R.layout.device_picker_item, viewGroup, false);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.device_icon);
        imageView.getClass();
        TextView textView = (TextView) inflate.findViewById(R.id.device_name);
        textView.getClass();
        TextView textView2 = (TextView) inflate.findViewById(R.id.caption);
        textView2.getClass();
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) inflate.findViewById(R.id.progress_indicator);
        circularProgressIndicator.getClass();
        TextView textView3 = (TextView) inflate.findViewById(R.id.select_button);
        textView3.getClass();
        return new C26934s(inflate, imageView, circularProgressIndicator, textView, textView2, textView3, this.f73418d, this.f73420f, this.f73421g);
    }

    public final /* synthetic */ void onViewRecycled(C0673gh ghVar) {
        C26934s sVar = (C26934s) ghVar;
        C28306ab.m52929e(sVar.itemView);
        sVar.itemView.setOnClickListener((View.OnClickListener) null);
    }
}
