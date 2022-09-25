package com.google.apps.tiktok.inject.p3660e.p3661a;

import android.content.Context;
import android.content.ContextWrapper;
import android.support.p031v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gsa.binaries.satin.app.awr;
import com.google.android.apps.gsa.binaries.satin.app.azb;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.e.a.b */
/* compiled from: PG */
public final class C47252b implements C68288b {

    /* renamed from: a */
    private volatile Object f122905a;

    /* renamed from: b */
    private final Object f122906b = new Object();

    /* renamed from: c */
    private final boolean f122907c;

    /* renamed from: d */
    private final View f122908d;

    /* renamed from: com.google.apps.tiktok.inject.e.a.b$a */
    /* compiled from: PG */
    public final class C47253a extends ViewComponentManager$FragmentContextWrapper {
        public C47253a(Context context, Fragment fragment) {
            super(context, fragment);
        }

        public C47253a(LayoutInflater layoutInflater, Fragment fragment) {
            super(layoutInflater, fragment);
        }
    }

    /* renamed from: com.google.apps.tiktok.inject.e.a.b$b */
    /* compiled from: PG */
    public interface C47254b {
        /* renamed from: ji */
        awr mo51151ji();
    }

    /* renamed from: com.google.apps.tiktok.inject.e.a.b$c */
    /* compiled from: PG */
    public interface C47255c {
        /* renamed from: ac */
        azb mo51152ac();
    }

    public C47252b(View view, boolean z) {
        this.f122908d = view;
        this.f122907c = z;
    }

    /* renamed from: a */
    private final Context m84054a(Class cls) {
        Context b = m84055b(this.f122908d.getContext(), cls);
        C58838bb.m90887v(b != m84055b(b.getApplicationContext(), C68288b.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.f122908d.getClass());
        return b;
    }

    /* renamed from: b */
    private static Context m84055b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        Object obj;
        if (this.f122905a == null) {
            synchronized (this.f122906b) {
                if (this.f122905a == null) {
                    Context a = m84054a(ViewComponentManager$FragmentContextWrapper.class);
                    if (a instanceof C47253a) {
                        awr ji = ((C47254b) ((C68288b) ((ViewComponentManager$FragmentContextWrapper) a).mo60322a()).mo17653jN()).mo51151ji();
                        ji.f204586a = this.f122908d;
                        obj = ji.mo68734a();
                    } else if (a instanceof ViewComponentManager$FragmentContextWrapper) {
                        C58838bb.m90887v(this.f122907c, "%s, Account views may only attach to account fragments.", this.f122908d.getClass());
                        azb ac = ((C47255c) ((C68288b) ((ViewComponentManager$FragmentContextWrapper) a).mo60322a()).mo17653jN()).mo51152ac();
                        ac.f204802a = this.f122908d;
                        obj = ac.mo68884a();
                    } else {
                        Context a2 = m84054a(C68288b.class);
                        C58838bb.m90890y(!(a2 instanceof C68288b), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment. Was attached to context: %s", this.f122908d.getClass(), a2.getClass().getName());
                        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity. Was attached to context: %s", new Object[]{this.f122908d.getClass(), a2.getClass().getName()}));
                    }
                    this.f122905a = obj;
                }
            }
        }
        return this.f122905a;
    }
}
