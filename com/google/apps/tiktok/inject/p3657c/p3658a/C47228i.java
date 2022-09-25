package com.google.apps.tiktok.inject.p3657c.p3658a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.google.android.apps.gsa.binaries.satin.app.awr;
import com.google.android.apps.gsa.binaries.satin.app.azb;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47252b;
import com.google.common.base.C58838bb;
import dagger.hilt.android.internal.managers.ViewComponentManager$FragmentContextWrapper;
import dagger.hilt.p5299a.C68288b;

/* renamed from: com.google.apps.tiktok.inject.c.a.i */
/* compiled from: PG */
public final class C47228i implements C68288b {

    /* renamed from: a */
    private volatile Object f122894a;

    /* renamed from: b */
    private final Object f122895b = new Object();

    /* renamed from: c */
    private final View f122896c;

    /* renamed from: com.google.apps.tiktok.inject.c.a.i$a */
    /* compiled from: PG */
    public interface C47229a {
        /* renamed from: ji */
        awr mo51138ji();
    }

    /* renamed from: com.google.apps.tiktok.inject.c.a.i$b */
    /* compiled from: PG */
    public interface C47230b {
        /* renamed from: ac */
        azb mo51139ac();
    }

    public C47228i(View view) {
        this.f122896c = view;
    }

    /* renamed from: a */
    private final Context m84019a(Class cls) {
        Context b = m84020b(this.f122896c.getContext(), cls);
        C58838bb.m90887v(b != m84020b(b.getApplicationContext(), C68288b.class), "%s, Sting view cannot be created using the application context. Use a Sting Fragment or Activity context.", this.f122896c.getClass());
        return b;
    }

    /* renamed from: b */
    private static Context m84020b(Context context, Class cls) {
        while ((context instanceof ContextWrapper) && !cls.isInstance(context)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    /* renamed from: jN */
    public final Object mo17653jN() {
        Object obj;
        if (this.f122894a == null) {
            synchronized (this.f122895b) {
                if (this.f122894a == null) {
                    Context a = m84019a(ViewComponentManager$FragmentContextWrapper.class);
                    if (a instanceof C47252b.C47253a) {
                        awr ji = ((C47229a) ((C68288b) ((ViewComponentManager$FragmentContextWrapper) a).mo60322a()).mo17653jN()).mo51138ji();
                        ji.f204586a = this.f122896c;
                        obj = ji.mo68734a();
                    } else if (a instanceof ViewComponentManager$FragmentContextWrapper) {
                        azb ac = ((C47230b) ((C68288b) ((ViewComponentManager$FragmentContextWrapper) a).mo60322a()).mo17653jN()).mo51139ac();
                        ac.f204802a = this.f122896c;
                        obj = ac.mo68884a();
                    } else {
                        C58838bb.m90887v(!(m84019a(C68288b.class) instanceof C68288b), "%s, @WithFragmentBindings Sting view must be attached to an @Sting Fragment.", this.f122896c.getClass());
                        throw new IllegalStateException(String.format("%s, Sting view must be attached to an @Sting Fragment or Activity.", new Object[]{this.f122896c.getClass()}));
                    }
                    this.f122894a = obj;
                }
            }
        }
        return this.f122894a;
    }
}
