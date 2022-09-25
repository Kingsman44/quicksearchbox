package com.google.android.apps.gsa.assistant.settings.features.help;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.preference.Preference;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50113la;

/* compiled from: PG */
public class DiscoverabilityTipPreference extends Preference {

    /* renamed from: I */
    private ImageView f193800I;

    /* renamed from: J */
    private TextView f193801J;

    /* renamed from: K */
    private LinearLayout f193802K;

    /* renamed from: a */
    public C50113la f193803a;

    /* renamed from: b */
    public boolean f193804b;

    /* renamed from: c */
    public int f193805c;

    /* renamed from: d */
    public C91189au f193806d;

    /* renamed from: e */
    public C91097g f193807e;

    /* renamed from: f */
    public h f193808f;

    /* renamed from: g */
    public m f193809g;

    /* renamed from: h */
    private LinearLayout f193810h;

    /* renamed from: i */
    private ImageView f193811i;

    public DiscoverabilityTipPreference(Context context) {
        super(context);
        this.f12718D = R.layout.discoverability_tip;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.help.DiscoverabilityTipPreference.a(androidx.preference.ax):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo8313a(androidx.preference.C3998ax r1) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.help.DiscoverabilityTipPreference.a(androidx.preference.ax):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.help.DiscoverabilityTipPreference.mo8313a(androidx.preference.ax):void");
    }

    /* renamed from: j */
    public final void mo64702j() {
        for (int i = 1; i < this.f193810h.getChildCount(); i++) {
            this.f193810h.getChildAt(i).setVisibility(this.f193805c);
        }
        int i2 = 8;
        if (this.f193804b) {
            this.f193802K.setVisibility(this.f193805c);
        } else {
            this.f193802K.setVisibility(8);
        }
        if ((this.f193803a.f130276a & 2) != 0) {
            this.f193801J.setVisibility(this.f193805c);
            if (this.f193805c == 0) {
                this.f193810h.setShowDividers(3);
            } else {
                this.f193810h.setShowDividers(2);
            }
        }
        ImageView imageView = this.f193811i;
        if (this.f193805c != 0) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
        this.f193800I.setVisibility(this.f193805c);
    }
}
