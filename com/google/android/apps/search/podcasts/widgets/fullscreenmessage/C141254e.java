package com.google.android.apps.search.podcasts.widgets.fullscreenmessage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.widgets.p10627i.C141264b;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.widgets.fullscreenmessage.e */
/* compiled from: PG */
public final class C141254e {

    /* renamed from: a */
    public C141251b f383492a;

    /* renamed from: b */
    public C141251b f383493b;

    /* renamed from: c */
    public C141251b f383494c;

    /* renamed from: d */
    private final FullScreenMessageView f383495d;

    /* renamed from: e */
    private final C47770dh f383496e;

    /* renamed from: f */
    private C141252c f383497f = C141252c.NONE;

    public C141254e(FullScreenMessageView fullScreenMessageView, C47770dh dhVar) {
        C69664n.m101061g(dhVar, "traceCreation");
        this.f383495d = fullScreenMessageView;
        this.f383496e = dhVar;
        fullScreenMessageView.setOrientation(1);
        fullScreenMessageView.setGravity(17);
        fullScreenMessageView.setVisibility(8);
    }

    /* renamed from: b */
    private final void m229283b(C141251b bVar) {
        int i;
        Integer num;
        View inflate = LayoutInflater.from(this.f383495d.getContext()).inflate(R.layout.podcasts_message, this.f383495d, true);
        ((TextView) inflate.findViewById(R.id.podcasts_message_primary)).setText(bVar.f383482c);
        TextView textView = (TextView) inflate.findViewById(R.id.podcasts_message_secondary);
        Integer num2 = bVar.f383483d;
        int i2 = 0;
        if (num2 != null) {
            textView.setText(num2.intValue());
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.podcasts_message_icon);
        imageView.setImageResource(bVar.f383480a);
        if (bVar.f383481b == null) {
            imageView.clearColorFilter();
        } else {
            Context context = this.f383495d.getContext();
            C69664n.m101060f(context, "messageLayerView.context");
            imageView.setColorFilter(C141264b.m229297a(context, bVar.f383481b.intValue()));
        }
        Button button = (Button) inflate.findViewById(R.id.podcasts_message_cta);
        if (bVar.f383485f == null || (num = bVar.f383484e) == null) {
            i2 = 8;
        } else {
            button.setText(num.intValue());
            button.setOnClickListener(new C47591co(this.f383496e, "message layer cta click", new C141253d(bVar)));
        }
        button.setVisibility(i2);
    }

    /* renamed from: a */
    public final void mo116270a(C141252c cVar) {
        C69664n.m101061g(cVar, "state");
        if (this.f383497f != cVar) {
            this.f383497f = cVar;
            this.f383495d.removeAllViewsInLayout();
            FullScreenMessageView fullScreenMessageView = this.f383495d;
            C141252c cVar2 = C141252c.NONE;
            int ordinal = cVar.ordinal();
            C141251b bVar = null;
            int i = 0;
            if (ordinal == 1) {
                C141251b bVar2 = this.f383492a;
                if (bVar2 == null) {
                    C69664n.m101065k("errorMessage");
                } else {
                    bVar = bVar2;
                }
                m229283b(bVar);
            } else if (ordinal == 2) {
                C141251b bVar3 = this.f383493b;
                if (bVar3 == null) {
                    C69664n.m101065k("emptyMessage");
                } else {
                    bVar = bVar3;
                }
                m229283b(bVar);
            } else if (ordinal != 3) {
                i = 8;
            } else {
                C141251b bVar4 = this.f383494c;
                if (bVar4 == null) {
                    C69664n.m101065k("explicitContentMessage");
                } else {
                    bVar = bVar4;
                }
                m229283b(bVar);
            }
            fullScreenMessageView.setVisibility(i);
        }
    }
}
