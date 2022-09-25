package com.google.android.apps.gsa.languagepack;

import android.view.LayoutInflater;
import android.widget.BaseAdapter;

/* renamed from: com.google.android.apps.gsa.languagepack.bo */
/* compiled from: PG */
final class C74612bo extends BaseAdapter {

    /* renamed from: a */
    final /* synthetic */ bp f208781a;

    /* renamed from: b */
    private final LayoutInflater f208782b;

    public C74612bo(bp bpVar) {
        this.f208781a = bpVar;
        this.f208782b = LayoutInflater.from(bpVar.getActivity());
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getCount() {
        return this.f208781a.i.size();
    }

    public final Object getItem(int i) {
        return this.f208781a.i.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.languagepack.bo.getView(int, android.view.View, android.view.ViewGroup):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View getView(int r1, android.view.View r2, android.view.ViewGroup r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.languagepack.bo.getView(int, android.view.View, android.view.ViewGroup):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.languagepack.C74612bo.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public final boolean isEnabled(int i) {
        return true;
    }
}
