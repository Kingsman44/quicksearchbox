package com.google.android.apps.gsa.assistant.shared.appactions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.Optional;

/* compiled from: PG */
public class ShortcutConfirmationLayout extends LinearLayout {

    /* renamed from: a */
    public Optional f195103a;

    public ShortcutConfirmationLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.shared.appactions.ShortcutConfirmationLayout.a(com.google.android.apps.gsa.assistant.shared.appactions.z, com.google.android.apps.gsa.assistant.shared.appactions.o):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: a */
    public final void mo65284a(com.google.android.apps.gsa.assistant.shared.appactions.C73834z r1, com.google.android.apps.gsa.assistant.shared.appactions.o r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.shared.appactions.ShortcutConfirmationLayout.a(com.google.android.apps.gsa.assistant.shared.appactions.z, com.google.android.apps.gsa.assistant.shared.appactions.o):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.shared.appactions.ShortcutConfirmationLayout.mo65284a(com.google.android.apps.gsa.assistant.shared.appactions.z, com.google.android.apps.gsa.assistant.shared.appactions.o):void");
    }

    public ShortcutConfirmationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f195103a = Optional.empty();
        View.inflate(context, R.layout.shortcut_confirmation_layout, this);
    }
}
