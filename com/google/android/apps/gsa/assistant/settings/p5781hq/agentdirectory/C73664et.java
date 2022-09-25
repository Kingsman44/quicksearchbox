package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory;

import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.c.b;
import com.google.android.libraries.logging.C28292j;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.et */
/* compiled from: PG */
public final class C73664et {

    /* renamed from: a */
    public b f194860a;

    /* renamed from: b */
    public final SparseArray f194861b = new SparseArray();

    public C73664et(b bVar) {
        this.f194860a = bVar;
    }

    /* renamed from: a */
    public final View.OnClickListener mo65139a(int i, Menu menu, View.OnClickListener onClickListener) {
        return new C73663es(this, onClickListener, new C28292j(i), menu);
    }

    /* renamed from: b */
    public final C28292j mo65140b(MenuItem menuItem) {
        if (menuItem == null) {
            return null;
        }
        return (C28292j) this.f194861b.get(menuItem.getItemId());
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.et.c(com.google.android.libraries.logging.j, android.view.Menu):com.google.android.libraries.logging.k, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: c */
    public final com.google.android.libraries.logging.C28293k mo65141c(com.google.android.libraries.logging.C28292j r1, android.view.Menu r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.et.c(com.google.android.libraries.logging.j, android.view.Menu):com.google.android.libraries.logging.k, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73664et.mo65141c(com.google.android.libraries.logging.j, android.view.Menu):com.google.android.libraries.logging.k");
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.et.d(int, int):void, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:59)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    /* renamed from: d */
    public final void mo65142d(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.et.d(int, int):void, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.C73664et.mo65142d(int, int):void");
    }
}
