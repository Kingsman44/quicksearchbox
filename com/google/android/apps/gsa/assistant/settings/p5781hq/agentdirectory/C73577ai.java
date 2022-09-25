package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.support.p033v7.widget.C0632eu;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5787e.C73647a;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.p7156a.C90679a;
import com.google.android.gms.auth.C142915o;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ai */
/* compiled from: PG */
public final class C73577ai extends C73647a {

    /* renamed from: a */
    public static final C59071e f194671a = null;

    /* renamed from: b */
    public final View f194672b;

    /* renamed from: c */
    public final C0632eu f194673c;

    /* renamed from: d */
    public final C86054o f194674d;

    /* renamed from: e */
    public final bm f194675e;

    /* renamed from: f */
    public String f194676f;

    /* renamed from: g */
    public final C142915o f194677g;

    /* renamed from: i */
    private final ImageView f194678i;

    /* renamed from: j */
    private final TextView f194679j;

    /* renamed from: k */
    private final StarRatingBar f194680k;

    /* renamed from: l */
    private final TextView f194681l;

    /* renamed from: m */
    private final TextView f194682m;

    /* renamed from: n */
    private final ImageButton f194683n;

    /* renamed from: o */
    private final C73664et f194684o;

    /* renamed from: p */
    private final C90679a f194685p;

    public C73577ai(View view, C90679a aVar, C86054o oVar, bm bmVar, C142915o oVar2) {
        super(view);
        this.f194672b = view;
        this.f194685p = aVar;
        this.f194674d = oVar;
        this.f194675e = bmVar;
        this.f194677g = oVar2;
        ImageView imageView = (ImageView) view.findViewById(R.id.reviewer_avatar);
        imageView.getClass();
        this.f194678i = imageView;
        TextView textView = (TextView) view.findViewById(R.id.reviewer_name);
        textView.getClass();
        this.f194679j = textView;
        StarRatingBar starRatingBar = (StarRatingBar) view.findViewById(R.id.review_star_rating_bar);
        starRatingBar.getClass();
        this.f194680k = starRatingBar;
        TextView textView2 = (TextView) view.findViewById(R.id.review_timestamp);
        textView2.getClass();
        this.f194681l = textView2;
        ImageButton imageButton = (ImageButton) view.findViewById(R.id.review_feedback_menu);
        imageButton.getClass();
        this.f194683n = imageButton;
        TextView textView3 = (TextView) view.findViewById(R.id.reviewer_comment);
        textView3.getClass();
        this.f194682m = textView3;
        view.getResources();
        C73664et etVar = new C73664et(new b());
        this.f194684o = etVar;
        etVar.mo65142d(R.id.agent_review_report_item, 51221);
        C0632eu euVar = new C0632eu(view.getContext(), imageButton, 5);
        this.f194673c = euVar;
        euVar.mo2856a().inflate(R.menu.agent_review_feedback_menu, euVar.f2394a);
        euVar.f2396c = new C73662er(etVar, new C73574af(this));
        imageButton.setOnClickListener(etVar.mo65139a(48611, euVar.f2394a, new C89943l(new C73575ag(this))));
    }

    /* renamed from: c */
    private final void m108160c(int i) {
        this.f194678i.setVisibility(i);
        this.f194679j.setVisibility(i);
        this.f194680k.setVisibility(i);
        this.f194681l.setVisibility(i);
        this.f194682m.setVisibility(i);
        this.f194683n.setVisibility(i);
    }

    /* renamed from: a */
    public final RecyclerView mo65066a() {
        return null;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ai.b(com.google.assistant.at.aap):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: b */
    public final void mo65067b(com.google.assistant.p3861at.aap r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.ai.b(com.google.assistant.at.aap):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73577ai.mo65067b(com.google.assistant.at.aap):void");
    }
}
