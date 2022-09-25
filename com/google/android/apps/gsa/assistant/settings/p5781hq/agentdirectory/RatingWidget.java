package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.content.Context;
import android.support.p033v7.widget.C0632eu;
import android.util.AttributeSet;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3861at.abr;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.RatingWidget */
/* compiled from: PG */
public class RatingWidget extends RelativeLayout {

    /* renamed from: e */
    private static final C58485gu f194602e = null;

    /* renamed from: a */
    public abr f194603a = abr.NOT_RATED;

    /* renamed from: b */
    public TextView f194604b;

    /* renamed from: c */
    public View f194605c;

    /* renamed from: d */
    public C0632eu f194606d = null;

    /* renamed from: f */
    private C73664et f194607f;

    /* renamed from: g */
    private ViewGroup f194608g;

    /* renamed from: h */
    private int f194609h;

    /* renamed from: i */
    private ImageButton[] f194610i;

    public RatingWidget(Context context) {
        super(context);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.RatingWidget.a(com.google.assistant.at.abr):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo65053a(com.google.assistant.p3861at.abr r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.RatingWidget.a(com.google.assistant.at.abr):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.RatingWidget.mo65053a(com.google.assistant.at.abr):void");
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.agent_directory_agent_rate_subtitle);
        this.f194604b = (TextView) findViewById(R.id.agent_directory_agent_rate_submit);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.agent_directory_rating_stars);
        this.f194608g = viewGroup;
        this.f194609h = viewGroup.getChildCount();
        this.f194605c = findViewById(R.id.agent_directory_agent_rating_menu);
        this.f194610i = new ImageButton[this.f194609h];
        for (int i = 0; i < this.f194609h; i++) {
            this.f194610i[i] = (ImageButton) this.f194608g.getChildAt(i);
            ImageButton imageButton = this.f194610i[i];
            C28292j jVar = new C28292j(36330 + i);
            jVar.mo33795i(5);
            C28295m.m52919e(imageButton, jVar);
            this.f194610i[i].setOnClickListener(new C89943l(new C73666ev(this, (abr) f194602e.get(i))));
        }
        TextView textView2 = this.f194604b;
        C28292j jVar2 = new C28292j(36351);
        jVar2.mo33795i(5);
        C28295m.m52919e(textView2, jVar2);
        this.f194604b.setOnClickListener(new C89943l(new C73667ew()));
        getResources();
        C73664et etVar = new C73664et((b) null);
        this.f194607f = etVar;
        etVar.mo65142d(R.id.rating_menu_edit, 47478);
        this.f194607f.mo65142d(R.id.rating_menu_delete, 47477);
        C0632eu euVar = new C0632eu(getContext(), this.f194605c, 5);
        this.f194606d = euVar;
        MenuInflater a = euVar.mo2856a();
        C0632eu euVar2 = this.f194606d;
        euVar2.getClass();
        a.inflate(R.menu.agent_directory_agent_rating_menu, euVar2.f2394a);
        C0632eu euVar3 = this.f194606d;
        euVar3.getClass();
        C73664et etVar2 = this.f194607f;
        euVar3.f2396c = new C73662er(etVar2, new C73668ex(this));
        this.f194605c.setOnClickListener(etVar2.mo65139a(47479, euVar3.f2394a, new C89943l(new C73669ey(this))));
    }

    public RatingWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RatingWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
