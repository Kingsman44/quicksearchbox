package com.evernote.android.state;

import android.os.Bundle;
import android.os.Parcelable;

/* compiled from: PG */
public class Injector {

    /* compiled from: PG */
    public abstract class Object extends Injector {
        static final Object DEFAULT = new Object() {
            public void restore(Object obj, Bundle bundle) {
            }

            public void save(Object obj, Bundle bundle) {
            }
        };

        public abstract void restore(Object obj, Bundle bundle);

        public abstract void save(Object obj, Bundle bundle);
    }

    /* compiled from: PG */
    public abstract class View extends Injector {
        static final View DEFAULT = new View() {
            public Parcelable restore(Object obj, Parcelable parcelable) {
                return parcelable;
            }

            public Parcelable save(Object obj, Parcelable parcelable) {
                return parcelable;
            }
        };

        public abstract Parcelable restore(Object obj, Parcelable parcelable);

        public abstract Parcelable save(Object obj, Parcelable parcelable);
    }

    protected Injector() {
    }
}
